
using System;
using System.Collections.Generic;
using System.Linq;

public class CreateUpdateNewUser : WebServiceTestBase
{
    public string UserName { get; set; }
    public string UniqueId { get; set; }
    public string Password { get; set; }
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string Email { get; set; }
    public string Role { get; set; }
    public string StreetAddress { get; set; }
    public string StreetAddress2 { get; set; }
    public string City { get; set; }
    public string State { get; set; }
    public string Country { get; set; }
    public string ZipCodeType { get; set; }
    public string ZipCode { get; set; }
    public string Telephone { get; set; }
    public string Extension { get; set; }
    public string LocationName { get; set; }
    public string DefaultRole { get; set; }
    public string Supervisor { get; set; }
    public string Group { get; set; }
    public string GroupByCode { get; set; }
    public string Cua { get; set; }
    public string Csua { get; set; }
    public string Language { get; set; }
    public string TimeZone { get; set; }
    public string Cac { get; set; }
    public string DirectSupervisor { get; set; }
    public string DefaultGroup { get; set; }
    public string Owner { get; set; }
    public bool Optin { get; set; }
    public string Delivery { get; set; }

    public virtual bool Create()
    {
        var emptyUser = GeoMaestroServices.GenerateUserObject();
        HydrateUser(emptyUser);
        Result = GeoMaestroServices.CreateUser(emptyUser);
        LastCreatedUser = emptyUser;
        return Result.Errors.Length == 0;
    }

    public virtual bool Update()
    {
        var repull = GeoMaestroServices.LoadUser(LastCreatedUser == null ? UserName : LastCreatedUser.UserName);
        UserName = repull.UserName;
        HydrateUser(repull);
        repull.ReceiveAutomatedEmails = Optin;
        Result = GeoMaestroServices.UpdateUser(repull);
        LastCreatedUser = repull;
        return Result.Errors.Length == 0;
    }

    protected virtual void HydrateUser(User emptyUser)
    {
        emptyUser.UserName = GetRandomIfAskedFor(UserName);
        emptyUser.UniqueId = GetRandomIfAskedFor(UniqueId);
        emptyUser.Password = Password;
        emptyUser.FirstName = FirstName;
        emptyUser.LastName = LastName;
        emptyUser.Email = Email;
        emptyUser.StreetAddress = StreetAddress;
        emptyUser.StreetAddress2 = StreetAddress2;
        emptyUser.Telephone = Telephone;
        emptyUser.Country = Country;
        emptyUser.City = City;
        emptyUser.State = State;
        emptyUser.Extension = Extension;
        emptyUser.LocationName = LocationName;
        emptyUser.PostalCode = ZipCode;
        emptyUser.PostalCodeType = GetPostalCodeType();
        emptyUser.TimeZone = TimeZone;
        emptyUser.Language = Language;
        emptyUser.RoleNames = GetBlankOrValueArray(Role);
        emptyUser.DefaultRoleName = DefaultRole;
        emptyUser.SupervisorUserNames = GetBlankOrValueArray(Supervisor);
        emptyUser.Groups = GetBlankOrValueGroupArray(Group, GroupByCode, DefaultGroup);
        emptyUser.CustomUserAttributes = GetBlankOrValueCuaArray(Cua);
        emptyUser.CustomSelectUserAttributes = GetBlankOrValueCuaArray(Csua);
        emptyUser.CatalogAccessCodeNames = GetBlankOrValueArray(Cac);
        emptyUser.DirectSupervisorName = DirectSupervisor;
        emptyUser.Owner = GetOwner();
        emptyUser.Delivery = GetNotificationDeliveryType();
    }

    private NotificationDelivery GetNotificationDeliveryType()
    {
        if (string.IsNullOrEmpty(Delivery))
        {
            return NotificationDelivery.Immediate;
        }
        return (NotificationDelivery)Enum.Parse(typeof(NotificationDelivery), Delivery);

    }

    private ProfileOwner GetOwner()
    {
        if(string.IsNullOrEmpty(Owner))
        {
            return ProfileOwner.LMS;
        }
        return (ProfileOwner)Enum.Parse(typeof (ProfileOwner), Owner);
        
    }

    private PostalCodeType GetPostalCodeType()
    {
        if(string.IsNullOrEmpty(ZipCodeType))
        {
            return PostalCodeType.Undefined;
        }
        return (PostalCodeType) Enum.Parse(typeof (PostalCodeType), ZipCodeType);
    }

    private CustomUserAttribute[] GetBlankOrValueCuaArray(string columnValue)
    {
        if (string.IsNullOrEmpty(columnValue))
        {
            return new CustomUserAttribute[] { };
        }
        var list = new List<CustomUserAttribute>();
        foreach (var entry in columnValue.Split(','))
        {
            string[] nameAndValue = entry.Split(':');
            list.Add(new CustomUserAttribute{Name=nameAndValue[0],Value = nameAndValue[1]});
        }
        return list.ToArray();
    }

    private static Group[] GetBlankOrValueGroupArray(string groupNames, string groupByCode, string defaultCode)
    {
        var groupAray = new List<Group>();

        if (!string.IsNullOrEmpty(groupNames))
        {
            groupAray.AddRange(groupNames.Split(',').Select(x => new Group { Name = x, IsDefault = x == defaultCode}).ToArray());
        }

        if (!string.IsNullOrEmpty(groupByCode))
        {
            groupAray.AddRange(groupByCode.Split(',').Select(x => new Group { Code = x, IsDefault = x == defaultCode }).ToArray());
        }

        return groupAray.ToArray();
    }

    private static string[] GetBlankOrValueArray(string columnValue)
    {
        if (string.IsNullOrEmpty(columnValue))
        {
            return new string[] { };
        }
        return columnValue.Split(',');
    }


    protected virtual string GetRandomIfAskedFor(string original)
    {
        if (!string.IsNullOrEmpty(original) && original.Equals("(RANDOM)"))
        {
            return Guid.NewGuid().ToString();
        }

        return original;
    }
}

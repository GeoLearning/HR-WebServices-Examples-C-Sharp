using System;
using System.Collections.Generic;
using System.Linq;
using fit;

public class InspectUserRowFixture : RowFixture
{
    private readonly User bob;
    private IList<ResultBean> results = new List<ResultBean>();

    public InspectUserRowFixture(User user)
    {
        bob = user;
    }

    public override object[] Query()
    {
        Add("First Name", bob.FirstName);
        Add("Last Name", bob.LastName);
        Add("Email",bob.Email);
        Add("Default Role",bob.DefaultRoleName);
        Add("Language",bob.Language);
        Add("Time Zone",bob.TimeZone);
        Add("Street Address",bob.StreetAddress);
        Add("Street Address 2",bob.StreetAddress2);
        Add("City",bob.City);
        Add("State",bob.State);
        Add("Country",bob.Country);
        Add("Zip Code Type",bob.PostalCodeType.ToString());
        Add("Zip Code",bob.PostalCode);
        Add("Telephone",bob.Telephone);
        Add("Extension",bob.Extension);
        Add("Location Name", bob.LocationName);
        Add("Owner", bob.Owner.ToString());
        Add("Receive Automated Emails", bob.ReceiveAutomatedEmails.ToString());
        foreach (var role in bob.RoleNames)
        {
            Add("Role",role);
        }
        foreach (var cacName in bob.CatalogAccessCodeNames)
        {
            Add("CAC",cacName);
        }
        foreach (var groupName in bob.Groups)
        {
            Add("Group",groupName.Name);
        }
        foreach (var csua in bob.CustomSelectUserAttributes)
        {
            Add("Csua",string.Format("{0}:{1}",csua.Name,csua.Value));
        }
        foreach (var cua in bob.CustomUserAttributes)
        {
            Add("Cua", string.Format("{0}:{1}", cua.Name, cua.Value));
        }
        foreach (var supervisorUserName in bob.SupervisorUserNames)
        {
            Add("Supervisor",supervisorUserName);
        }
        Add("Direct Supervisor",bob.DirectSupervisorName);

        return results.ToArray();
    }

    private void Add(string field, string value)
    {
        results.Add(new ResultBean{Field = field, Value = value});
    }

    public override Type GetTargetClass()
    {
        return typeof (InspectUserRowFixture);
    }

    public class ResultBean
    {
        public String Field { get; set;}
        public String Value { get; set; }
    }
}
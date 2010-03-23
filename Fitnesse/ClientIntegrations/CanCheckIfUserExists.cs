
public class CanCheckIfUserExists : CreateUpdateNewUser
{
    public bool UserNameExists(string username, bool expectedResult)
    {
        var result = GeoMaestroServices.UserExists(username);
        return result == expectedResult;
    }

    public bool UserUniqueIdExists(string uniqueId, bool expectedResult)
    {
        var result = GeoMaestroServices.UserExistsByUniqueId(uniqueId);
        return result == expectedResult;
    }

    public bool UniqueIdForLastCreatedUserExists( bool expectedResult)
    {
        var id = LastCreatedUser.UniqueId;
        return UserUniqueIdExists(id, expectedResult);
    }

    public bool UserExternalIdExists(string uniqueId, bool expectedResult)
    {
        var result = GeoMaestroServices.UserExistsByExternalId(uniqueId);
        return result == expectedResult;
    }

    public bool ExternalIdForLastCreatedUserExists(bool expectedResult)
    {
        var id = GeoMaestroServices.LoadUser(LastCreatedUser.UserName).ExternalId;
        return UserExternalIdExists(id, expectedResult);
    }
}

using System;
using System.Linq;
using fit;

public class WarninngResultValidator : RowFixture
{
    private readonly Result Result;

    public WarninngResultValidator(Result result)
    {
        Result = result;
    }

    public override object[] Query()
    {
        return Result.Warnings.OfType<string>().Select(x => new WarningErrorString {Message = x}).ToArray();
    }

    public override Type GetTargetClass()
    {
        return typeof (WarninngResultValidator);
    }
}

public class ErrorsResultValidator : RowFixture
{
    private readonly Result Result;

    public ErrorsResultValidator(Result result)
    {
        Result = result;
    }

    public override object[] Query()
    {
        return Result.Errors.OfType<string>().Select(x => new WarningErrorString { Message = x }).ToArray();
    }

    public override Type GetTargetClass()
    {
        return typeof(ErrorsResultValidator);
    }
}

public class WarningErrorString
{
    public string Message { get; set; }
}
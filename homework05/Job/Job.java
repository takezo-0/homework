public class Job
{
    protected int priority;         // 1, 2, or 3
    protected String description;
    
    Job()                  
    {
        priority = 0;
        description = "none";
    }

    Job(String d, int p)
    {
        priority = p;
        description = d;
    }

    public void setDescription(String d)
    {
        description = d;
    }
    public String getDescription() { return description; }

    public void setPriority(int p)
    {
        priority = p;
    }
    public int getPriority() { return priority; }

    public String toString()
    { 
        return "Job: " + description + ", Priority: " + priority;
    }
}


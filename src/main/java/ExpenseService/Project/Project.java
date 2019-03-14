package ExpenseService.Project;

public class Project {
    
    private ProjectType projectType;

    private String projectName;

    public Project(ProjectType projectType, String projectName) {
        this.projectType = projectType;
        this.projectName = projectName;
    }

    public ProjectType getProjectType() {
        return projectType;
    }

    public String getProjectName() {
        return projectName;
    }
}

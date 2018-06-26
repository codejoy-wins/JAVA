public class ProjectTestClass{
    public static void main(String[] args){
        ProjectClass emptyProject = new ProjectClass();
        ProjectClass namedProject = new ProjectClass("proj_1");
        ProjectClass bothProject = new ProjectClass("proj_2", "better than v1");
        System.out.println(emptyProject.elevatorPitch());
        System.out.println(namedProject.elevatorPitch());
        System.out.println(bothProject.elevatorPitch());
        emptyProject.setCost(66.30);
        emptyProject.setDescription("the og");
        System.out.println(emptyProject.elevatorPitch());
        emptyProject.setName("Marcus_Auruelius");
        System.out.println(emptyProject.elevatorPitch());

    }
}
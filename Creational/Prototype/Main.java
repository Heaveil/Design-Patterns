public class Main{
    public static void main (String[] args){
        Prototype original = new Prototype(new Name("I am the original"));
        Prototype shallow = original.shallowclone();
        Prototype deep = original.deepclone();

        System.out.println("Original Name : " + original.getName());
        System.out.println("Shallow Name  : " + shallow.getName());
        System.out.println("Deep Name     : " + deep.getName());
        original.setName("I am a copy");
        System.out.println("Changing Status");
        System.out.println("Original Name : " + original.getName());
        System.out.println("Shallow Name  : " + shallow.getName());
        System.out.println("Deep Name     : " + deep.getName());        
    }
}
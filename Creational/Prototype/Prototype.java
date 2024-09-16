public class Prototype {
    private Name name;

    public Prototype(Name name){
        this.name = name;
    }

    public Prototype(Prototype original, boolean deepClone){
         if (deepClone) {
             this.name = new Name(original.name.getName());
         } else {
             this.name = original.name;
         }
    }

    public Prototype shallowclone(){
         return new Prototype(this, false);
    }

    public Prototype deepclone(){
         return new Prototype(this, true);
    }

    public String getName(){
        return name.getName();
    }

    public void setName(String name){
        this.name.setName(name);
    }
}

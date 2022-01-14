public class Buildings {
    public Integer id;
    public String initialResident;
    public String[] initialResidents = new String[100];

    public Buildings(String initialResident, Integer id) {
        this.id = id;
        this.initialResident = initialResident;
    }

    public Buildings(String[] initialResidents, Integer id){
        this.initialResidents = initialResidents;
        this.id = id;
    }

    public void add(String resident){
        initialResidents[0] = resident;
    }

    public void remove(String name){

    }
}

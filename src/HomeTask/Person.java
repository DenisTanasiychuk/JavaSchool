package HomeTask;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person){

        if ((!this.spouse.equals(null))&(!this.spouse.equals(person.spouse))||(!person.spouse.equals(null))&(!person.spouse.equals(this.spouse))){
            this.divorce();
            person.divorce();
        }

        if ((this.man!=person.man)&((!this.spouse.equals(person)) & (!person.spouse.equals(this.spouse)))){

            return true;

        }else {

            return false;
        }


    }


    public  boolean divorce(){
        if (!(this.spouse.equals(null))){
            this.spouse = null;
            return true;
        }else {
            return false;
        }

    }


}

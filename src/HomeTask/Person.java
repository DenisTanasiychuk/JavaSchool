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

        //Проверяем что люди не являются супрагами и у них нет других супругов.Если есть то с помошью метода divorce() делаем бракоразводный процесс.
        if ((!this.spouse.equals(null))&(!this.spouse.equals(person.spouse))
                ||(!person.spouse.equals(null))&(!person.spouse.equals(this.spouse))){
            this.divorce();
            person.divorce();
        }
        // Проверяем что люди разного пола и не являеются супругами.
        if ((this.man!=person.man)&((!this.spouse.equals(person)) & (!person.spouse.equals(this.spouse)))){
            this.spouse=person;
            person.spouse=this;
            return true;

        }else {

            return false;
        }


    }

    // Если у человека значение spouse не null, то метод превращает его в null.
    public  boolean divorce(){
        if (!(this.spouse.equals(null))){
            this.spouse = null;
            return true;
        }else {
            return false;
        }

    }


}

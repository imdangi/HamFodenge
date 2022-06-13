package JavaTrainingAssignments.Day4.Assignment4;

public class Caller{

    public Caller(Person person){
        System.out.println("------------------------------------------------------");
        System.out.println("||    -- "+person.getClass().getSimpleName()+" --     ||");
        person.printDetails();

        if(person instanceof Admin){
            Admin admin=(Admin)person;
            admin.adminRoles();//admin roles
            admin.adminRights();//admin rights
        }
        else if(person instanceof FullTimeEmployee){
            FullTimeEmployee fte=(FullTimeEmployee) person;
            fte.attendance();
            fte.calculateBonus();
        }

        else if (person instanceof PartimeEmployee){
            ((PartimeEmployee)person).attendance();
            ((PartimeEmployee)person).calculateBonus();
        }

        else if(person instanceof FreeLancer){
            ((FreeLancer)person).attendance();
            ((FreeLancer)person).calculateBonus();
        }

        else if(person instanceof Customer){
            ((Customer)person).membershipStatus();
        }

        System.out.println("******************************************************");
    }
}

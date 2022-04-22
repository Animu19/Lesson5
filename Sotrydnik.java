class Sotrydnik{
    String FIO;
    String DOLJNOST;
    String EMAIL;
    String TELEPHON;
    int PAY;
    int AGE;

    Sotrydnik(String FIO, String DOLJNOST, String EMAIL, String TELEPHON, int PAY, int AGE){
        this.FIO = FIO;
        this.DOLJNOST = DOLJNOST;
        this.EMAIL = EMAIL;
        this.TELEPHON = TELEPHON;
        this.PAY = PAY;
        this.AGE = AGE;
    }
    void Information(){
        System.out.println("ФИО:"+FIO);
        System.out.println("Должность:"+DOLJNOST);
        System.out.println("@Email:"+EMAIL);
        System.out.println("Телефон:+"+TELEPHON);
        System.out.println("Зарплата:"+PAY+"р");
        System.out.println("Возраст:"+AGE);
    }
    public static void main(String[] args){
        Sotrydnik[] SotrydnikMass = new Sotrydnik[5];
        SotrydnikMass[0] = new Sotrydnik("Иванов Иван Иванович","Генеральный Директор","pochta19@mail.ru","375295264274",5000,60);
        SotrydnikMass[1]= new Sotrydnik("Ларионов Ираклий Кимович","Зам ген. директора","Newpochta@mail.ru","375296483458",3500,45);
        SotrydnikMass[2]= new Sotrydnik("Иванков Мстислав Тимурович","Уборщик","2pocha23@mail.ru","375296312754",400,55);
        SotrydnikMass[3]= new Sotrydnik("Шашков Емельян Всеволодович","Менеджер","tasbbs2@mail.ru","375296388954",1000,25);
        SotrydnikMass[4]= new Sotrydnik("Некрасов Панкратий Пётрович","Сотрудник тех. поддержки","hhhts2@mail.ru","375296648345",700,20);
        for (int i=0;i<SotrydnikMass.length;++i)
            if(SotrydnikMass[i].AGE>40) {
                SotrydnikMass[i].Information();
                System.out.println();
            }
    }
}

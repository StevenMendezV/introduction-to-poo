import java.util.Map;

class Card extends Payment{
    Integer number;
    Integer cvv;
    Map<String, Map<String, Integer>> date;

    public Card(Integer id, Integer number, Integer cvv, Map<String, Map<String, Integer>> date){
        super(id);
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }

}
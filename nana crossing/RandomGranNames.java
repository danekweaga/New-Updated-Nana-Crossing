import java.util.Random;
/**********************************************************************************************************
 * @title RandomGranNames
 * The Game class contains a differrent ways of saying grandma and a method to print a random one.
 *
 * @authors Chukwunonso Ekweaga, Ashlee Muichirahondo and Alamin Adeleke
 **********************************************************************************************************/
public class RandomGranNames
{
    // Array of losing messages
    protected static final String[] names = 
    {
        "Granny", "Nana", "Nanny", "Gram",
        "Grandmom", "Oma", "Nonna", "Abuela",
        "Yaya", "Bubbe", "Gigi", "Lola", "Tutu",
        "Mamo", "Mimi", "Nona", "Mémé", "Grams",
        "Grandmaw", "Big Mama", "Nanny G", "Grandmama",
        "Nana Bear", "Grandy", "Grandmaw", "Omi", "Nonnie",
        "Granny Mae", "Lita", "Lolly", "Grandma Jean", "Mammaw",
        "Mimma", "Meme-Jean", "Big Gran", "Granddoll", "Mamita",
        "MawMaw", "Mimi G", "Tita", "Grandmammy", "G-Ma",
        "Grandmommy", "Nonka", "Lulu", "Bobby", "Meemaw",
        "Nanita", "Bubba", "Yaya-Belle", "GrandyPops", "Grandbeau",
        "MomMom", "Gran-Gran", "G-Mamma", "Abuela ",
        "Lala", "GiGi", "Momma", "Granmama", "Coco",
        "Babi", "Amah", "Mamoo", "Deedee",
        "Oma-Sita", "Jaja", "Meemaw-Gigi", "Gramsy", "LinLin",
        "Mama Boo", "Nani", "Grams-Lu", "rosie",
        "Mama Dee", "Mami", "Gaga", "Mammy", "Grandmon",
        "Mama Nene", "G-Maw", "Granny Lou", "Mama Liza",
        "Mom-mom", "Mamachka", "Baba", "Lita-Mimi", "Great Gran",
        "Lulu-Nana", "Nonita", "Nona-Belle", "Avo-Lou", "Nonnie-Boo",
        "Nonna-Mom", "Titi-Mom", "Mamiya", "Gram-Gigi", "Mama Lita",
        "Mum-Mum", "MamaRose", "Lalou", "Nana-Pop", "Gam-Gam",
        "G-Grandma", "G-Gma", "Babbie", "Meme-Maw", "Momsy",
        "Grandmama-Boo", "Mimi-Lola", "Abo", "Grandmama Lou", "Mommaw",
        "Nonni", "TitiLita", "Nonnie", "Gandy", "Tutu-Belle",
        "MeeMee", "Nonna-Mimi", "Oma-Belle", "Mimi-Lou", "Mamasita",
        "G-Mama", "Grand-Pop", "Mamou", "Mima",
        "Popi", "PopPop", "NonnaGigi", "Sanni", "Tata-Mama",
        "Poppy-Nana", "Granny-Pop", "Mama-G", "G-Grams", "Lolo",
        "Mum-Mum", "Mamita-Lou", "Bubby", "Dida", "Grandmommy Lou",
        "Granddama", "Mimsy", "Mamah", "Mimo", "Nonie", "MommyLola"
    };

    /*******************************************************************************************
     * Method to get a granny name
     * @return a random Granny from the NAMES array.
     *******************************************************************************************/
    public static String out() 
    {
      Random random = new Random();
      return(names[random.nextInt(names.length)]);
    }
}  

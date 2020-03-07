package lesson1.task3;

import lesson1.task3.service.PersonServiceSortByComparator;
import lesson1.task3.service.PersonServiceSortCommon;
import lesson1.task3.struct.Person;
import lesson1.task3.struct.Sex;

import java.util.ArrayList;

public class Main {

    /**
     * Мужские имена
     */
    private final static String[] MALE_NAMES = new String[]{
        "Noah", "Liam", "William", "Mason", "James", "Benjamin", "Jacob", "Michael", "Elijah", "Ethan", "Alexander","Oliver", "Daniel", "Lucas", "Matthew", "Aiden", "Jackson", "Logan", "David", "Joseph", "Samuel", "Henry", "Owen", "Sebastian", "Gabriel", "Carter", "Jayden", "John", "Luke", "Anthony", "Isaac", "Dylan", "Wyatt", "Andrew", "Joshua", "Christopher", "Grayson", "Jack", "Julian", "Ryan", "Jaxon", "Levi", "Nathan", "Caleb", "Hunter", "Christian", "Isaiah", "Thomas", "Aaron", "Lincoln", "Charles", "Eli", "Landon", "Connor", "Josiah", "Jonathan", "Cameron", "Jeremiah", "Mateo", "Adrian", "Hudson", "Robert", "Nicholas", "Brayden", "Nolan", "Easton", "Jordan", "Colton", "Evan", "Angel", "Asher", "Dominic", "Austin", "Leo", "Adam", "Jace", "Jose", "Ian", "Cooper", "Gavin", "Carson", "Jaxson", "Theodore", "Jason", "Ezra", "Chase", "Parker", "Xavier", "Kevin", "Zachary", "Tyler", "Ayden", "Elias", "Bryson", "Leonardo", "Greyson", "Sawyer", "Roman", "Brandon", "Bentley", "Kayden", "Ryder", "Nathaniel", "Vincent", "Miles", "Santiago", "Harrison", "Tristan", "Declan", "Cole", "Maxwell", "Luis", "Justin", "Everett", "Micah", "Axel", "Wesley", "Max", "Silas", "Weston", "Ezekiel", "Juan", "Damian", "Camden", "George", "Braxton", "Blake", "Jameson", "Diego", "Carlos", "Ivan", "Kingston", "Ashton", "Jesus", "Brody", "Emmett", "Abel", "Jayce", "Maverick", "Bennett", "Giovanni", "Eric", "Maddox", "Kaiden", "Kai", "Bryce", "Alex", "Calvin", "Ryker", "Jonah", "Luca", "King", "Timothy", "Alan", "Brantley", "Malachi", "Emmanuel", "Abraham", "Antonio", "Richard", "Jude", "Miguel", "Edward", "Victor", "Amir", "Joel", "Steven", "Matteo", "Hayden", "Patrick", "Grant", "Preston", "Tucker", "Jesse", "Finn", "Oscar", "Kaleb", "Gael", "Graham", "Elliot", "Alejandro", "Rowan", "Marcus", "Jeremy", "Zayden", "Karter", "Beau", "Bryan", "Maximus", "Aidan", "Avery", "Elliott", "August", "Nicolas", "Mark", "Colin", "Waylon", "Bradley", "Kyle", "Kaden", "Xander", "Caden", "Paxton", "Brian", "Dean", "Paul", "Peter", "Kenneth", "Jasper", "Lorenzo", "Zane", "Zion", "Beckett", "River", "Jax", "Andres", "Dawson", "Messiah", "Jaden", "Rhett", "Brady", "Lukas", "Omar", "Jorge", "Riley", "Derek", "Charlie", "Emiliano", "Griffin", "Myles", "Brooks", "Israel", "Sean", "Judah", "Iker", "Javier", "Erick", "Tanner", "Corbin", "Adriel", "Jase", "Jake", "Simon", "Cayden", "Knox", "Tobias", "Felix", "Milo", "Jayceon", "Gunner", "Francisco", "Kameron", "Cash", "Remington", "Reid", "Cody", "Martin", "Andre", "Rylan", "Maximiliano", "Zander", "Archer", "Barrett", "Killian", "Stephen", "Clayton", "Thiago", "Spencer", "Amari", "Josue", "Holden", "Emilio", "Arthur", "Chance", "Eduardo", "Leon", "Travis", "Ricardo", "Damien", "Manuel", "Gage", "Keegan", "Titus", "Raymond", "Kyrie", "Nash", "Finley", "Fernando", "Louis", "Peyton", "Rafael", "Phoenix", "Jaiden", "Lane", "Dallas", "Emerson", "Cristian", "Collin", "Kyler", "Devin", "Jeffrey", "Walter", "Anderson", "Cesar", "Mario", "Donovan", "Seth", "Garrett", "Enzo", "Conner", "Legend", "Caiden", "Beckham", "Jett", "Ronan", "Troy", "Karson", "Edwin", "Hector", "Cohen", "Ali", "Trevor", "Conor", "Orion", "Shane", "Andy", "Marco", "Walker", "Angelo", "Quinn", "Dalton", "Sergio", "Ace", "Tyson", "Johnny", "Dominick", "Colt", "Johnathan", "Gideon", "Julius", "Cruz", "Edgar", "Prince", "Dante", "Marshall", "Ellis", "Joaquin", "Major", "Arlo", "Alexis", "Reed", "Muhammad", "Frank", "Theo", "Shawn", "Erik", "Grady", "Nehemiah", "Daxton", "Atticus", "Gregory", "Matias", "Bodhi", "Emanuel", "Jensen", "Kash", "Romeo", "Desmond", "Solomon", "Allen", "Jaylen", "Leonel", "Roberto", "Pedro", "Kason", "Fabian", "Clark", "Dakota", "Abram", "Noel", "Kayson", "Malik", "Odin", "Jared", "Warren", "Kendrick", "Rory", "Jonas", "Adan", "Ibrahim", "Trenton", "Finnegan", "Landen", "Adonis", "Jay", "Ruben", "Drew", "Gunnar", "Ismael", "Jaxton", "Kane", "Hendrix", "Atlas", "Pablo", "Zaiden", "Wade", "Russell", "Cade", "Sullivan", "Malcolm", "Kade", "Harvey", "Princeton", "Skyler", "Corey", "Esteban", "Leland", "Derrick", "Ari", "Kamden", "Zayn", "Porter", "Franklin", "Raiden", "Braylon", "Ronald", "Cyrus", "Benson", "Malakai", "Hugo", "Marcos", "Maximilian", "Hayes", "Philip", "Lawson", "Phillip", "Bruce", "Braylen", "Zachariah", "Damon", "Dexter", "Enrique", "Aden", "Lennox", "Drake", "Khalil", "Tate", "Zayne", "Milan", "Brock", "Brendan", "Armando", "Gerardo", "Jamison", "Rocco", "Nasir", "Augustus", "Sterling", "Dillon", "Royal", "Royce", "Moses", "Jaime", "Johan", "Scott", "Chandler", "Raul", "Remy", "Cason", "Luka", "Mohamed", "Deacon", "Winston", "Albert", "Pierce", "Taylor", "Nikolai", "Bowen", "Danny", "Francis", "Brycen", "Jayson", "Moises", "Keith", "Hank", "Quentin", "Kasen", "Donald", "Julio", "Davis", "Alec", "Kolton", "Lawrence", "Rhys", "Kian", "Nico", "Matthias", "Kellan", "Mathias", "Ariel", "Justice", "Braden", "Rodrigo", "Ryland", "Leonidas", "Jerry", "Ronin", "Alijah", "Kobe", "Lewis", "Dennis", "Luciano", "Ahmed", "Frederick", "Darius", "Arjun", "Dax", "Asa", "Nixon", "Ezequiel", "Eden", "Tony", "Landyn", "Emmitt", "Mathew", "Kyson", "Otto", "Saul", "Uriel", "Colby", "Dustin", "Omari", "Raphael", "Brennan", "Callen", "Keaton", "Arturo", "Isaias", "Roy", "Kieran", "Ty", "Dorian", "Cannon", "Marvin", "Cullen", "Sage", "Uriah", "Darren", "Cayson", "Aarav", "Case", "Izaiah", "Armani", "Gustavo", "Jimmy", "Alberto", "Duke", "Rayan", "Chris", "Casey", "Roland", "Moshe", "Curtis", "Mauricio", "Alonzo", "Yusuf", "Nikolas", "Soren", "Hamza", "Jasiah", "Alfredo", "Devon", "Jalen", "Raylan", "Edison", "Jamari", "Oakley", "Samson", "Lionel", "Reece", "Sam", "Quincy", "Jakob", "Apollo", "Kingsley", "Ahmad", "Bryant", "Alvin", "Trey", "Mohammed", "Conrad", "Mitchell", "Salvador", "Quinton", "Bo", "Mohammad", "Elian", "Gianni", "Lennon", "Leonard", "Douglas", "Cassius", "Ricky", "Carl", "Gary", "Larry", "Colten", "Ramon", "Kellen", "Korbin", "Wilson", "Kylan", "Santino", "Niko", "Issac", "Jagger", "Lance", "Joe", "Julien", "Orlando", "Jefferson", "Memphis", "Crosby", "Mekhi", "Nelson", "Lucian", "Ayaan", "Nathanael", "Neil", "Makai", "Finnley", "Rex", "Forrest", "Layton", "Randy", "Boston", "Tristen", "Tatum", "Brayan", "Sylas", "Thaddeus", "Trent", "Morgan", "Roger", "Abdullah", "Casen", "Maurice", "Sincere", "Titan", "Kyree", "Talon", "Fletcher", "Langston", "Eddie", "Briggs", "Noe", "Kamari", "Rowen", "Zeke", "Aldo", "Kaison", "Valentino", "Vihaan", "Alden", "Terry", "Bruno", "Canaan", "Lee", "Byron", "Kohen", "Reese", "Braydon", "Madden", "Deandre", "Flynn", "Harley", "Hezekiah", "Amos", "Harry", "Zain", "Alessandro", "Stanley", "Lucca", "Branson", "Ernesto", "Joziah", "Leandro", "Ares", "Marc", "Blaine", "Joey", "Jon", "Yosef", "Carmelo", "Franco", "Jamal", "Mack", "Kristian", "Dane", "Lachlan", "Callum", "Graysen", "Kye", "Ben", "Aryan", "Gannon", "London", "Kareem", "Stetson", "Kristopher", "Tomas", "Ford", "Bronson", "Enoch", "Baylor", "Kaysen", "Axton", "Jaxen", "Rodney", "Dominik", "Emery", "Layne", "Wilder", "Jamir", "Tripp", "Kelvin", "Vicente", "Augustine", "Brett", "Callan", "Clay", "Crew", "Brecken", "Jacoby", "Abdiel", "Allan", "Maxton", "Melvin", "Rayden", "Terrance", "Demetrius", "Rohan", "Wayne", "Yahir", "Arian", "Fox", "Brentley", "Ray", "Zechariah", "Cain", "Guillermo", "Otis", "Tommy", "Alonso", "Dariel", "Jedidiah", "Maximo", "Cory", "Grey", "Reyansh", "Skylar", "Marcelo", "Castiel", "Kase", "Toby", "Bobby", "Jadiel", "Marcel", "Lochlan", "Jeffery", "Zackary", "Fisher", "Yousef", "Aron", "Chaim", "Felipe", "Axl", "Anakin", "Brodie", "Dash", "Anson", "Maison", "Zaire", "Samir", "Damari", "Elisha", "Davion", "Eugene", "Hassan", "Kannon", "Azariah", "Clyde", "Harper", "Nickolas", "Boone", "Magnus", "Coen", "Kole", "Willie", "Chad", "Xzavier", "Duncan", "Harold", "Houston", "Landry", "Trace", "Alvaro", "Ameer", "Junior", "Kamdyn", "Vincenzo", "Gerald", "Marlon", "Payton", "Jamie", "Kamryn", "Camdyn", "Anders", "Aydin", "Bentlee", "Reginald", "Jaziel", "Benton", "Bodie", "Misael", "Westin", "Will", "Channing", "Harlan", "Kody", "Kolten", "Thatcher", "Valentin", "Henrik", "Keenan", "Terrence", "Denver", "Emory", "Jerome", "Jermaine", "Cairo", "Sonny", "Mayson", "Alfred", "Cristiano", "Darian", "Eliseo", "Maxim", "Stefan", "Hugh", "Santana", "Javion", "Leighton", "Miller", "Riaan", "Rogelio", "Rudy", "Blaze", "Bridger", "Darwin", "Markus", "Ronnie", "Shepherd", "Vaughn", "Billy", "Marley", "Huxley", "Rey", "Keagan", "Draven", "Shiloh", "Brysen", "Giovani", "Alistair", "Brixton", "Heath", "Kalel", "Reuben", "Ridge", "Adrien", "Rene", "Sutton", "Zyaire", "Ephraim", "Neymar", "Vance", "Zavier", "Jessie", "Dangelo", "Dayton", "Emmet", "Ishaan", "Zaid", "Camron", "Jordy", "Kenny", "Micheal", "Shaun", "Alexzander", "Howard", "Kylo", "Eason", "Blaise", "Craig", "Hakeem", "Karim", "Jabari", "Jairo", "Khalid", "Turner", "Van", "Westley", "Braiden", "Cedric", "Darrell", "Louie", "Mustafa", "Yehuda", "Justus", "Salvatore", "Alfonso", "Kendall", "Konnor", "Lamar", "Gibson", "Ignacio", "Koda", "Leroy", "Terrell", "Tristian", "Achilles", "Jericho", "Ramiro", "Yahya", "Rolando", "Vivaan", "Dario", "Jair", "Ulises", "Judson", "Kashton", "Tadeo", "Marquis", "Avi", "Dimitri", "Dwayne", "Musa", "Ahmir", "Gordon", "Ira", "Seamus", "Kolby", "Brantlee", "Javon", "Rocky", "Urijah", "Brayson", "Mikael", "Santos", "Gilbert", "Greysen", "Lyric", "Coleman", "Dominique", "Foster", "Gauge", "Harris", "Kymani", "Leif", "Agustin", "Keanu", "Konner", "Brent", "Immanuel", "Benicio", "Ernest", "Merrick", "Yisroel", "Amare", "Jad", "Lyle", "Creed", "Krish", "Maddux", "Camilo", "Giancarlo", "Jamarion", "Steve", "Anton", "Jamar", "Jeremias", "Ralph", "Wesson", "Bode", "Braeden", "Brenden", "Eliezer", "Davian", "Gus", "Jonathon"
    };

    /**
     * Женские имена
     */
    private final static String[] FEMALE_NAMES = new String[]{
        "Emma", "Olivia", "Ava", "Sophia", "Isabella", "Mia", "Charlotte", "Abigail", "Emily", "Harper", "Amelia", "Evelyn", "Elizabeth", "Sofia", "Madison", "Avery", "Ella", "Scarlett", "Grace", "Chloe", "Victoria", "Riley", "Aria", "Lily", "Aubrey", "Zoey", "Penelope", "Lillian", "Addison", "Layla", "Natalie", "Camila", "Hannah", "Brooklyn", "Zoe", "Nora", "Leah", "Savannah", "Audrey", "Claire", "Eleanor", "Skylar", "Ellie", "Samantha", "Stella", "Paisley", "Violet", "Mila", "Allison", "Alexa", "Anna", "Hazel", "Aaliyah", "Ariana", "Lucy", "Caroline", "Sarah", "Genesis", "Kennedy", "Sadie", "Gabriella", "Madelyn", "Adeline", "Maya", "Autumn", "Aurora", "Piper", "Hailey", "Arianna", "Kaylee", "Ruby", "Serenity", "Eva", "Naomi", "Nevaeh", "Alice", "Luna", "Bella", "Quinn", "Lydia", "Peyton", "Melanie", "Kylie", "Aubree", "Mackenzie", "Kinsley", "Cora", "Julia", "Taylor", "Katherine", "Madeline", "Gianna", "Eliana", "Elena", "Vivian", "Willow", "Reagan", "Brianna", "Clara", "Faith", "Ashley", "Emilia", "Isabelle", "Annabelle", "Rylee", "Valentina", "Everly", "Hadley", "Sophie", "Alexandra", "Natalia", "Ivy", "Maria", "Josephine", "Delilah", "Bailey", "Jade", "Ximena", "Alexis", "Alyssa", "Brielle", "Jasmine", "Liliana", "Adalynn", "Khloe", "Isla", "Mary", "Andrea", "Kayla", "Emery", "London", "Kimberly", "Morgan", "Lauren", "Sydney", "Nova", "Trinity", "Lyla", "Margaret", "Ariel", "Adalyn", "Athena", "Lilly", "Melody", "Isabel", "Jordyn", "Jocelyn", "Eden", "Paige", "Teagan", "Valeria", "Sara", "Norah", "Rose", "Aliyah", "Mckenzie", "Molly", "Raelynn", "Leilani", "Valerie", "Emerson", "Juliana", "Nicole", "Laila", "Makayla", "Elise", "Mariah", "Mya", "Arya", "Ryleigh", "Adaline", "Brooke", "Rachel", "Eliza", "Angelina", "Amy", "Reese", "Alina", "Cecilia", "Londyn", "Gracie", "Payton", "Esther", "Alaina", "Charlie", "Iris", "Arabella", "Genevieve", "Finley", "Daisy", "Harmony", "Anastasia", "Kendall", "Daniela", "Catherine", "Adelyn", "Vanessa", "Brooklynn", "Juliette", "Julianna", "Presley", "Summer", "Destiny", "Amaya", "Hayden", "Alana", "Rebecca", "Michelle", "Eloise", "Lila", "Fiona", "Callie", "Lucia", "Angela", "Marley", "Adriana", "Parker", "Alexandria", "Giselle", "Alivia", "Alayna", "Brynlee", "Ana", "Harley", "Gabrielle", "Dakota", "Georgia", "Juliet", "Tessa", "Leila", "Kate", "Jayla", "Jessica", "Lola", "Stephanie", "Sienna", "Josie", "Daleyza", "Rowan", "Evangeline", "Hope", "Maggie", "Camille", "Makenzie", "Vivienne", "Sawyer", "Gemma", "Joanna", "Noelle", "Elliana", "Mckenna", "Gabriela", "Kinley", "Rosalie", "Brynn", "Amiyah", "Melissa", "Adelaide", "Malia", "Ayla", "Izabella", "Delaney", "Cali", "Journey", "Maci", "Elaina", "Sloane", "June", "Diana", "Blakely", "Aniyah", "Olive", "Jennifer", "Paris", "Miranda", "Lena", "Jacqueline", "Paislee", "Jane", "Raegan", "Lyric", "Lilliana", "Adelynn", "Lucille", "Selena", "River", "Annie", "Cassidy", "Jordan", "Thea", "Mariana", "Amina", "Miriam", "Haven", "Remi", "Charlee", "Blake", "Lilah", "Ruth", "Amara", "Kali", "Kylee", "Arielle", "Emersyn", "Alessandra", "Fatima", "Talia", "Vera", "Nina", "Ariah", "Allie", "Addilyn", "Keira", "Catalina", "Raelyn", "Phoebe", "Lexi", "Zara", "Makenna", "Ember", "Leia", "Rylie", "Angel", "Haley", "Madilyn", "Kaitlyn", "Heaven", "Nyla", "Amanda", "Freya", "Journee", "Daniella", "Danielle", "Kenzie", "Ariella", "Lia", "Brinley", "Maddison", "Shelby", "Elsie", "Kamila", "Camilla", "Alison", "Ainsley", "Ada", "Laura", "Kendra", "Kayleigh", "Adrianna", "Madeleine", "Joy", "Juniper", "Chelsea", "Sage", "Erin", "Felicity", "Gracelyn", "Nadia", "Skyler", "Briella", "Aspen", "Myla", "Heidi", "Katie", "Zuri", "Jenna", "Kyla", "Kaia", "Kira", "Sabrina", "Gracelynn", "Gia", "Amira", "Alexia", "Amber", "Cadence", "Esmeralda", "Katelyn", "Scarlet", "Kamryn", "Alicia", "Miracle", "Kelsey", "Logan", "Kiara", "Bianca", "Kaydence", "Alondra", "Evelynn", "Christina", "Lana", "Aviana", "Dahlia", "Dylan", "Anaya", "Ashlyn", "Jada", "Kathryn", "Jimena", "Elle", "Gwendolyn", "April", "Carmen", "Mikayla", "Annalise", "Maeve", "Camryn", "Helen", "Daphne", "Braelynn", "Carly", "Cheyenne", "Leslie", "Veronica", "Nylah", "Kennedi", "Skye", "Evie", "Averie", "Harlow", "Allyson", "Carolina", "Tatum", "Francesca", "Aylin", "Ashlynn", "Sierra", "Mckinley", "Leighton", "Maliyah", "Annabella", "Megan", "Margot", "Luciana", "Mallory", "Millie", "Regina", "Nia", "Rosemary", "Saylor", "Abby", "Briana", "Phoenix", "Viviana", "Alejandra", "Frances", "Jayleen", "Serena", "Lorelei", "Zariah", "Ariyah", "Jazmin", "Avianna", "Carter", "Marlee", "Eve", "Aleah", "Remington", "Amari", "Bethany", "Fernanda", "Malaysia", "Willa", "Liana", "Ryan", "Addyson", "Yaretzi", "Colette", "Macie", "Selah", "Nayeli", "Madelynn", "Michaela", "Priscilla", "Janelle", "Samara", "Justice", "Itzel", "Emely", "Lennon", "Aubrie", "Julie", "Kyleigh", "Sarai", "Braelyn", "Alani", "Lacey", "Edith", "Elisa", "Macy", "Marilyn", "Baylee", "Karina", "Raven", "Celeste", "Adelina", "Matilda", "Kara", "Jamie", "Charleigh", "Aisha", "Kassidy", "Hattie", "Karen", "Sylvia", "Winter", "Aleena", "Angelica", "Magnolia", "Cataleya", "Danna", "Henley", "Mabel", "Kelly", "Brylee", "Jazlyn", "Virginia", "Helena", "Jillian", "Madilynn", "Blair", "Galilea", "Kensley", "Wren", "Bristol", "Emmalyn", "Holly", "Lauryn", "Cameron", "Hanna", "Meredith", "Royalty", "Sasha", "Lilith", "Jazmine", "Alayah", "Madisyn", "Cecelia", "Renata", "Lainey", "Liberty", "Brittany", "Savanna", "Imani", "Kyra", "Mira", "Mariam", "Tenley", "Aitana", "Gloria", "Maryam", "Giuliana", "Skyla", "Anne", "Johanna", "Myra", "Charley", "Tiffany", "Beatrice", "Karla", "Cynthia", "Janiyah", "Melany", "Alanna", "Lilian", "Demi", "Pearl", "Jaylah", "Maia", "Cassandra", "Jolene", "Crystal", "Everleigh", "Maisie", "Anahi", "Elianna", "Hallie", "Ivanna", "Oakley", "Ophelia", "Emelia", "Mae", "Marie", "Rebekah", "Azalea", "Haylee", "Bailee", "Anika", "Monica", "Kimber", "Sloan", "Jayda", "Anya", "Bridget", "Kailey", "Julissa", "Marissa", "Leona", "Aileen", "Addisyn", "Kaliyah", "Coraline", "Dayana", "Kaylie", "Celine", "Jaliyah", "Elaine", "Lillie", "Melina", "Jaelyn", "Shiloh", "Jemma", "Madalyn", "Addilynn", "Alaia", "Mikaela", "Adley", "Saige", "Angie", "Dallas", "Braylee", "Elsa", "Emmy", "Hayley", "Siena", "Lorelai", "Miah", "Royal", "Tiana", "Elliot", "Kori", "Greta", "Charli", "Elliott", "Julieta", "Alena", "Rory", "Harlee", "Rosa", "Ivory", "Guadalupe", "Jessie", "Laurel", "Annika", "Clarissa", "Karsyn", "Collins", "Kenia", "Milani", "Alia", "Chanel", "Dorothy", "Armani", "Emory", "Ellen", "Irene", "Adele", "Jaelynn", "Myah", "Hadassah", "Jayde", "Lilyana", "Malaya", "Kenna", "Amelie", "Reyna", "Teresa", "Angelique", "Linda", "Nathalie", "Kora", "Zahra", "Aurelia", "Kalani", "Rayna", "Jolie", "Sutton", "Aniya", "Jessa", "Laylah", "Esme", "Keyla", "Ariya", "Elisabeth", "Marina", "Mara", "Meadow", "Aliza", "Zelda", "Lea", "Elyse", "Monroe", "Penny", "Lilianna", "Lylah", "Liv", "Scarlette", "Kadence", "Ansley", "Emilee", "Perla", "Annabel", "Alaya", "Milena", "Karter", "Avah", "Amirah", "Leyla", "Livia", "Chaya", "Wynter", "Jaycee", "Lailah", "Amani", "Milana", "Lennox", "Remy", "Zariyah", "Clare", "Hadlee", "Kiera", "Rosie", "Alma", "Kaelyn", "Eileen", "Jayden", "Martha", "Noa", "Christine", "Ariadne", "Natasha", "Emerie", "Tatiana", "Joselyn", "Joyce", "Salma", "Amiya", "Audrina", "Kinslee", "Jaylene", "Analia", "Erika", "Lexie", "Mina", "Patricia", "Dulce", "Poppy", "Aubrielle", "Clementine", "Lara", "Amaris", "Milan", "Aliana", "Kailani", "Kaylani", "Maleah", "Belen", "Simone", "Whitney", "Elora", "Claudia", "Gwen", "Rylan", "Antonella", "Khaleesi", "Arely", "Princess", "Kenley", "Itzayana", "Karlee", "Paulina", "Laney", "Bria", "Chana", "Kynlee", "Astrid", "Giovanna", "Lindsey", "Sky", "Aryanna", "Ayleen", "Azariah", "Joelle", "Nala", "Tori", "Noemi", "Breanna", "Emmeline", "Mavis", "Amalia", "Mercy", "Tinley", "Averi", "Aiyana", "Alyson", "Corinne", "Leanna", "Madalynn", "Briar", "Jaylee", "Kailyn", "Kassandra", "Kaylin", "Nataly", "Amia", "Yareli", "Cara", "Taliyah", "Thalia", "Carolyn", "Estrella", "Montserrat", "Zaylee", "Anabelle", "Deborah", "Frida", "Zaria", "Kairi", "Katalina", "Nola", "Erica", "Isabela", "Jazlynn", "Paula", "Faye", "Louisa", "Alessia", "Courtney", "Reign", "Ryann", "Stevie", "Heavenly", "Lisa", "Roselyn", "Raina", "Adrienne", "Celia", "Estelle", "Marianna", "Brenda", "Kathleen", "Paola", "Hunter", "Ellis", "Hana", "Lina", "Raquel", "Aliya", "Iliana", "Kallie", "Emmalynn", "Naya", "Reina", "Wendy", "Landry", "Barbara", "Casey", "Karlie", "Kiana", "Rivka", "Kenya", "Aya", "Carla", "Dalary", "Jaylynn", "Sariah", "Andi", "Romina", "Dana", "Danica", "Ingrid", "Kehlani", "Zaniyah", "Alannah", "Avalynn", "Evalyn", "Sandra", "Veda", "Hadleigh", "Paityn", "Abril", "Ciara", "Holland", "Lillianna", "Kai", "Bryleigh", "Emilie", "Carlee", "Judith", "Kristina", "Janessa", "Annalee", "Zoie", "Maliah", "Bonnie", "Emmaline", "Louise", "Kaylynn", "Monserrat", "Nancy", "Noor", "Vada", "Aubriella", "Maxine", "Nathalia", "Tegan", "Aranza", "Emmie", "Brenna", "Estella", "Ellianna", "Kailee", "Ailani", "Caylee", "Zainab", "Zendaya", "Jana", "Julianne", "Ellison", "Sariyah", "Lizbeth", "Susan", "Alyvia", "Jewel", "Marjorie", "Marleigh", "Nathaly", "Sharon", "Yamileth", "Zion", "Mariyah", "Lyra", "Belle", "Yasmin", "Kaiya", "Maren", "Marisol", "Vienna", "Calliope", "Hailee", "Rayne", "Tabitha", "Anabella", "Blaire", "Giana", "Milania", "Paloma", "Amya", "Novalee", "Harleigh", "Ramona", "Rhea", "Aadhya", "Miya", "Desiree", "Frankie", "Sylvie", "Jasmin", "Moriah", "Rosalyn", "Kaya", "Joslyn", "Tinsley", "Farrah", "Aislinn", "Halle", "Madyson", "Micah", "Arden", "Bexley", "Ari", "Aubri", "Ayana", "Cherish", "Davina", "Anniston", "Riya", "Adilynn", "Ally", "Amayah", "Harmoni", "Heather", "Saoirse", "Azaria", "Alisha", "Nalani", "Maylee", "Shayla", "Briley", "Elin", "Lilia", "Ann", "Antonia", "Aryana", "Chandler", "Esperanza", "Lilyanna", "Alianna", "Luz", "Meilani"
    };

    /**
     * Максимально возможный возраст
     */
    private final static int MAX_AGE = 100;

    private static ArrayList<Person> people = new ArrayList<>();

    /**
     * Функция для получения рандомного числа в диапазоне [0, max]
     * @param max - правая граница диапазона рандомных чисел
     * @return - рандомное число
     */
    private static int getRandomInteger(int max) {
        return (int) (Math.random() * (max + 1));
    }

    private static boolean shouldGenerateCompoundName() {
        return getRandomInteger(10000) < 5000;
    }

    private static String getRandomName(String type) {
        if (type.equals(Sex.MAN)) {
            if (shouldGenerateCompoundName()) {
                String firstNamePart = MALE_NAMES[getRandomInteger(MALE_NAMES.length - 1)];
                String secondNamePart = MALE_NAMES[getRandomInteger(MALE_NAMES.length - 1)];
                return firstNamePart + "-" + secondNamePart;
            }
            return MALE_NAMES[getRandomInteger(MALE_NAMES.length - 1)];
        } else {
            if (shouldGenerateCompoundName()) {
                String firstNamePart = FEMALE_NAMES[getRandomInteger(FEMALE_NAMES.length - 1)];
                String secondNamePart = FEMALE_NAMES[getRandomInteger(FEMALE_NAMES.length - 1)];
                return firstNamePart + "-" + secondNamePart;
            }
            return FEMALE_NAMES[getRandomInteger(FEMALE_NAMES.length - 1)];
        }
    }

    /**
     * Генерирует мужчину
     * @return возвращает сгенерируемого мужчину
     * @throws Exception тип сгенерированного исключения, в случае некорректного пола
     */
    private static Person generateMan() throws Exception {
        int age = getRandomInteger(MAX_AGE);
        String name = getRandomName(Sex.MAN);
        return new Person(age, Sex.MAN, name);
    }

    /**
     * Генерирует женщину
     * @return возаращает сгенерируемую женщину
     * @throws Exception тип сгенерированного исключения, в случае некорректного пола
     */
    private static Person generateWoman() throws Exception {
        int age = getRandomInteger(MAX_AGE);
        String name = getRandomName(Sex.WOMAN);
        return new Person(age, Sex.WOMAN, name);
    }

    /**
     * Поиск дубликатов в сгенерируемых пользователях
     * @throws Exception тип генерируемого исключения
     */
    private static void checkPeopleOnValid() throws Exception {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = i; j < people.size(); j++) {
                if (people.get(i).getName().equals(people.get(j).getName()) && people.get(i).getAge().equals(people.get(j).getAge()) && i != j) {
                    //uncomment to see duplicates
                    //throw new Exception("There are duplicates!");
                }
            }
        }
    }

    /**
     * Заполнить список с пользователями
     * @throws Exception тип исключения в случае нахождения дупликатов
     */
    private static void generatePeople() throws Exception {
        while (people.size() < 10000) {
            people.add(getRandomInteger(100000) < 50000 ? generateMan() : generateWoman());
        }
        checkPeopleOnValid();
    }

    public static void main(String[] args) throws Exception {
        people.clear();
        generatePeople();
        PersonServiceSortByComparator personServiceSortByComparator = new PersonServiceSortByComparator();
        PersonServiceSortCommon personServiceSortCommon = new PersonServiceSortCommon();

        long currentTime = System.currentTimeMillis();
        personServiceSortByComparator.sort(people);
        System.out.println("Время выполнения: " + (System.currentTimeMillis() - currentTime));
        System.out.println(people);

        people.clear();
        generatePeople();
        currentTime = System.currentTimeMillis();
        personServiceSortCommon.sort(people);
        System.out.println("Время выполнения: " + (System.currentTimeMillis() - currentTime));
        System.out.println(people);

    }
}

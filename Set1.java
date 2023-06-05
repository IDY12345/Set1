import java.util.Scanner;
public class Set1
{
    public static void main(
    )throws InterruptedException 
    {
        Scanner sc=new Scanner(System.in);
        Set1 ob=new Set1();
        System.out.println("                                    WELCOME TO THE QUIZ SHOW                ");
        System.out.println(" The Insructions are as Follows:  ");
        System.out.println("   1. There Will be in Total Three Sets.  ");
        System.out.println("   2. Each Set Would Be Having 5 Questions. ");
        System.out.println("   3. In First Two Sets Any of Your Answer Goes Wrong then You Can't Play the next Question.   ");
        System.out.println("   4. But in the Third Set Your Answer Goes Wrong You will be Allowed to Play the next ");
        System.out.println("      Question But Your Money Will Not Increase  ."); 
        System.out.println("   5. The Last Question of the Last Set Would Be An Optional Question If You Want To Play ,");
        System.out.println("      You could Play else Could Quit.   ");
        System.out.println("   6. In the Last Set If Your Optional Question's Answer Goes Wrong Your Amount Will ");
        System.out.println("       Come Down to the Amount You had earned At The end of The Second Set." );
        System.out.println("   7. Please Write Anything To Start the Quiz. ");
        String STAR=sc.nextLine();
        if(STAR.equalsIgnoreCase(""))
        {
            System.out.println("\f");
            ob.Question1();  
        }
        else
        {
            System.out.println("\f");
            ob.Question1();
        }
    }
    public void Question1()throws InterruptedException 
    {
        Scanner sc=new Scanner(System.in);
        Set1 ob=new Set1();
        int flag=0;
        int Score;
        String cap[]=new String[100];
        String na[]={"What is the capital of United States of America?","What is the Capital of United Arab Emirates?","What is the capital of Japan ?","What is the capital of Russia ?","What is the capital of England ?","What is the Capital of Afghanistan ","What is the capital of Brazil ?","What is the capital of Belgium ?","What is the capital of Egypt ?","What is the capital of Germany ?","What is the capital of Romania ?","What is the capital of Singapore ?","What is the capital of Saudi Arabia ?","What is the capital Hungary ?","What is the capital of Laos ?","What is the capital of Lebanon ?","What is the capital of Macedonia ?","What is the capital of Libya ?","What is the capital of Norway ?","What is the capital of Scotland ?","What is the capital of Serbia ?","What is the capital of Sudan ?","What is the capital of  Uganda ?","What is the capital of Venezuela ?","What is the capital of Chile ?","What is the capital of Canada ?","What is the capital of Comoros ?","What is the capital of Jordan ?","What is the capital of Kenya ?","What is the capital of Nicargua ?","What is the capital of Morocco ?","What is the capital of Palau ?","What is the capital of Saint Lucia ?","What is the capital of Sweden ?","What is the capital of Zimbabwe ?","What is the capital of Zambia ?","What is the capital of Kiribati ?","What is the capital of Guinea ?","What is the capital of Gambia ?","What is the capital of Grenada ?","What is the capital of Iceland ?","What is the capital of Gabon ?","What is the capital of Georgia ?","What is the capital of Fiji ?","What is the capital of East Timor ?","What is the capital of French Guiana ?","What is the capital of Haiti ?","What is the capital of  Kosovo ?","What is the capital of Honduras ?","What is the capital of Madagascar ?","What is the capital of Albania ?","What is the capital of Angola ?","What is the capital of  Armenia ?","What is the capital of Bahmas ?","What is the capital of Belarus ?","What is the capital of Benin ?","What is the capital of Belize ?","What is the capital of Botswana ?","What is the capital of Bulgaria ?","What is the capital of Burundi ?","What is the capital of Cameroon ?","What is the capital of Cape Verde ?","What is the capital of Chad ?","What is the capital of Colombia ?","What is the capital of Costa Rica ?","What is the capital of Cyprus ?","What is the capital of Czech Republic ?","What is the capital of Dominica ?","What is the capital of Ecuador ?","What is the capital of Eritrea ?","What is the capital of Estonia ?","What is the capital of Federation of Micronesia ?","What is the capital of Ghana ?","What is the capital of Kazakhstan ?","What is the capital of Kyrgyzstan ?","What is the capital of Lesotho ?","What is the capital of Liberia ?","What is the capital of Liechtenstein ?","What is the capital of Lithuania ?","What is the capital of Malawi ?","What is the capital of Mali ?","What is the Capital of Malta ?","What is the capital of Marshall Islands ?","What is the capital of Mauritania ?","What is the capital of Mauritius ?","What is the capital of  Moldova ?","What is the capital of Motenegro ?","What is the capital of Mazambique ?","What is the capital of Namibia ?","What is the capital of Niger ?","What is the capital of Portugal ?","What is the capital of Rwanda ?","What is the capital of Saint Kitts and Nevis ?","What is the capital of Samoa ?","What is the capital of Senegal ?","What is the capital of Sierra Leone ?","What is the capital of Slovenia ?","What is the capital of Somalia ?","What is the capital of Suriname ?","What is the capital of Swaziland ?","What is the capital of Tanzania ?"};
        String ans[]={"Washington","Abu Dhabi","Tokyo","Moscow","London","Kabul","Brasilia","Brussels","Cairo","Berlin","Bucharest","Singapore","Riyadh","Budapest","Vientiane","Beirut","Skopje","Tripoli","Oslo","Edinburgh","Belgrade","Khartoum","Kampala","Carcas","Santiago","Ottawa","Moroni","Amman","Nairobi","Managua","Rabat","Melekeok","Casstries","Stockholm","Harare","Lusaka","Tarawa Atoll","Conarky","Banjul","Saint George's","Reykjavik","Libreville","Tbilisi","Suva","Dili","Cayenne","Port au Prince","Pristina","Tegucigalpa","Antananarivo","Tirana","Luanda","Yerevan","Nassau","Minsk","Porto Novo","Belmopan","Gaborone","Sofia","Bujumbara","Yaounde","Praia","N'Djamena","Bogota","San Jose","Nicosia","Prague","Roseau","Quito","Asmara","Tallinn","Palikir","Acra","Astana","Bishkek","Maseru","Monrovia","Vaduz","Vilnius","Lilongwe","Bamako","Valleta","Majuro","Nauakchott","Port Louis","Chisinau","Podgorica","Mabuto","Windhoek","Niamey","Lisbon","Kigali","Basseterre","Apia","Dakar","Freetown","Ljubljana","Mogadishu","Paramaribo","Mbabana","Dodoma"};
        String opt[]={"a) Washington     b) New York   c) Chicago  d)Seattle", " a) Berlin   b) Lome   c) Tunis   d) Abu Dhabi"," a) Kampala   b) Tokyo   c) Carcas   d) Tashkent"," a) Montevideo   b) Hanoi    c) Moscow    d) Sanaa "," a) London   b) Algiers   c) Vienna   d) Baku "," a) Kandhar   b) Minsk    c) Kabul  d) Belmopan"," a) Manama   b) Dhaka   c) Bridgetown   d) Brasilia "," a) Brussels    b) Panama      c)Singapore      d)Vienna"," a) Cairo   b) Hague  c) Wellington   d) Maputo "," a) Thimpu    b)Sofia     c)Berlin     d)Sarajevo"," a) Jakarta      b) Bucharest      c) Bagdhad       d) Tehran"," a) Dublin     b)Bern      c)Singapore    d) Pretoria "," a) Muscat       b) Asucion    c) Peru      d)Riyadh"," a) Pretoria b) Budapest c) Bishkek d) Asucion"," a) Riga b) Budapest c) Vientiane d) Bagdhad"," a) Beirut b) Monrovia c) Luxembourg d) Paris "," a) Montevideo b) Paris c) Male d) Skopje"," a) Majuro b) Monaco c) Tripoli d) Abuja"," a) Oslo b) Kigali c) Apia d) Dakar"," a) Victoria b) Edinburgh c) Freetown d) Juba"," a) Bratislava b) Honiara c) Belgrade d) Seoul"," a) Khartoum b) Kingstown c) Triploli d) Ankara"," a) Lusaka b) Harare c) Cardiff d)Kampala"," a) Cairo b) Carcas c) Ottawa d) Bangui"," a) Zagreb b) Prague c) Santiago d) Havana"," a) Beijing b) Ottawa c) Bogota d) San Jose"," a) Moroni b) Zagreb c) Nicosia d) Dili"," a) Bogota b) Moroni c) Dili d) Amman"," a) Dili b) Nairobi c) Pristina d) Amsterdam"," a) Warsaw b) Managua c) Niamey d) Belfast"," a) Rabat b) Manila c) Warsaw d) Niamey"," a) Doha b) Castries c) Fanafuti d) Melekeok"," a) Castries b) Doha c) Damascus d) Dodoma"," a) Port of Spain b) Lome c) Port Vila d) Stockholm"," a) Sanaa b) Harare c) Hanoi d) Dodoma"," a) Lusaka b) Harare c) Astana d) Sanaa"," a) Dublin b) New Delhi c) Accra d) Tarawa Atoll"," a) Conarky b) Tbilisi c) Helsiniki d) Georgetown"," a) Helsinki b) Banjul c) Bissau d) Conarky"," a) Saint George's b) Conarky c) Banjul d) Bissau"," a)Reykjavik b) Conarky c) Siant's George d) Banjul"," a) Akra b) Athens c) Libreville d) Georgetown"," a) Addis Ababa b) Tbilisi c) Suva d) Tallinn"," a) Roseau b) Quito c) Suva d) Malbo"," a) Santo Domingo b) Palikir c) Dili d) Cayenne"," a) Asmara b) Suva c) Malbo d) Cayenne"," a) Port au Prince b) Tehran c) Astana d) Amman"," a) Pristina b) Amman c) Tehran d) Astana"," a) Pristina b) Tegucigalpa c) Tehran d) Astana"," a) Antananarivo b) Vaduz c) Vilnius d) Valleta"," a) Yerevan b) Bujumbara c) Tirana d) Launda"," a) Nassau b) Gaborone c) Yerevan d) Luanda"," a) Yerevan b) Belmopan c) Gaborone d) Nassau"," a) Minsk b) Nassau c) Belmopan d) Bujumbara"," a) Porto Novo b) Minsk c) Belmopan d) Gaborone"," a) Bujumbara b) Sofia c) Porto Novo d) Gaborone"," a) Gaborone b) Bujumbara c) Belmopan d) Tirana"," a) Gaborone b) Nassau c) Yerevan d) Luanda"," a) Bujumbara b) Sofia c) Porto Novo d) Gaborone","a) Gaborone b) Bujumbara c) Belmopan d) Tirana"," a) Gaborone b) Bujumbara c) Belmopan d) Yaounde "," a) Praia b) Bujumbara c) Belmopan d) Yaounde"," a) Yaounde b) N'Djamena c) Bujumbara d) Belmopan "," a) Yaounde b) N'Djamena c) Bogota d) Belmopan"," a) San Jose b) Yaounde c) N'Djamena d) Bogota"," a) Yaounde b) N'Djamena c) Prague d) Nicosia"," a) Yaounde b) N'Djamena c) Prague d) Nicosia"," a) Roseau b) Nicosia c) Prague d) Belmopan"," a) Yaounde b) Quito c) Prague d) Nicosia"," a) Asmara b) Quito c) Prague d) Nicosia"," a) Asmara b) Quito c) Tallinn d) Palikir","a) Asmara b) Quito c) Tallinn d) Palikir "," a) Asmara b) Acra c) Tallinn d) Palikir", " a) Astana b) Acra c) Tallinn d) Palikir"," a) Astana b) Acra c) Bishkek d) Palikir","a) Astana b) Acra c) Bishkek d) Maseru"," a) Monrovia b) Acra c) Bishkek d) Maseru"," a) Monrovia b) Vaduz c) Bishkek d) Maseru"," a) Monrovia b) Vaduz c) Vilnius d) Maseru "," a) Monrovia b) Vaduz c) Vilnius d) Maseru "," a) Monrovia b) Vaduz c) Vilnius d) Bamako"," a) Valleta b) Vaduz c) Vilnius d) Bamako "," a) Valleta b) Majuro c) Vilnius d) Bamako "," a) Valleta b) Majuro c) Nouakchott d) Bamako"," a) Valleta b) Majuro c) Nouakchott d) Port Louis"," a) Chisinau b) Majuro c) Nouakchott d) Port Louis "," a) Chisinau b) Majuro c) Podgorica d) Port Louis "," a) Chisinau b) Mabuto c) Podgorica d) Port Louis "," a) Windhoek b) Mabuto c) Podgorica d) Port Louis "," a) Chisinau b) Niamey c) Podgorica d) Port Louis "," a) Chisinau b) Mabuto c) Podgorica d) Lisbon "," a) Chisinau b) Kigali c) Podgorica d) Lisbon "," a) Chisinau b) Mabuto c) Basseterre d) Port Louis "," a) Chisinau b) Mabuto c) Podgorica d) Apia "," a) Chisinau b) Mabuto c) Dakar d) Port Louis "," a) Chisinau b) Mabuto c) Freetown d) Apia "," a) Chisinau b) Mabuto c) Apia d) Ljubljana "," a) Chisinau b) Mogadishu c) Podgorica d) Ljubljana "," a) Ljubljana b) Apia c) Podgorica d) Paramaribo "," a) Ljubljana b) Mbabana c) Apia d) Paramaribo "," a) Chisinau b) Mabuto c) Podgorica d) Dodoma "};
        System.out.println("Enter your Full Name:");
        String name=sc.nextLine();
        int i=(int)(Math.random()*100);
        System.out.println("Q.1 "+na[i]+"            (₹ 1,000)");
        System.out.println("      ");
        System.out.println(opt[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans[i]))
        {
        System.out.println("Your Answer is Correct");
        Score=flag+1000;
        System.out.println("Money Earned = ₹ "+Score);
        Thread.sleep(700);
        System.out.print("\f"); 
        ob.Question2(name,Score);
        }
        else
        {
        System.out.println("Your Answer is Wrong "+name+".");
        System.out.println("The Correct Answer is:"+ans[i]);
        System.out.println("Money Earned = ₹ "+flag);
        System.out.println("You Have Lost the Quiz");
        System.out.println("                                    Well Tried          ");
        Thread.sleep(2000);
        System.out.println("\f");
        }
    }
    public void Question2(String r,int S)throws InterruptedException
    {
        Scanner sc=new Scanner(System.in); 
        Set1 ob=new Set1();
        String cap[]=new String[11];
        System.out.println("The Next Question is");
        String Ques2[]={"Who was the Winner of the noble Prize in Literaure in 2017 ?","Which Country won the Kabaddi Asian Games Gold Medal in 2018 ?","Who has won the Prestigious Man Booker International Prize for fiction in 2018 ?","Who is the Chief Executive Officer of Amazon ?","Which country won the Most number of Medals in Asian Games 2018  ?","In which country 'La Tomatina' Festival is celebrated ?","Who won the Noble Peace Prize in 2017 ?","Who was the first Indian in independent India to have won a medal in an individual Olympic event ?","Who defined democracy as a Government of the people, by the people and for the people?","Myanmar does not share its international boundary with ?" ,"From July 1, 2017, the nationwide GST (Goods & Services Tax) has been rolled out in India, making the country a single market. What is the current size ?"," Which among the following places is not a site for India’s currency notes printing press ?",""};
        String ans1[]={"Kazuo Ishiguro","Iran","Olga Tokarczuck","Jeff Bezos","China","Spain","ICAN Organisation","K D Jadhav","Abraham Lincoln","Vietnam","USD 2 Trillion","Jhansi"};  
        String opt1[]={" a)Olga Tokarczuck    b)Jeff Bezos    c)Bob Dylan   d)Kazuo Ishiguro "," a)Bangladesh    b)India   c)Iran     d)South Korea"," a)Kazuo Ishiguro   b)Olga Tokarczuck    c)Jeff Bezos   d) Bob Dylan"," a)Kazuo Ishiguro   b)Olga Tokarczuck    c)Jeff Bezos   d) Bob Dylan","a)China   b)India   c)Iran     d)South Korea"," a)China  b)Spain   c)Japan  d) Belgium"," a) Jaun Manuel Santos   b)Kailash Satyarthi    c) ICAN Organisation d)OPCW Organisation "," a)  Dhyanchand b) K D Jadhav c) Prithipal Singh d) Harishchandra Birajdar","a) Abraham Lincoln b) Plato c) Aristotle d) Ruskin "," a)  Laos b) Thailand c) Vietnam d) India "," a) USD 1 Trillion b) USD 2 Trillion c) USD 3 Trillion d) USD 4 Trillion "," a) Nasik b) Mysuru c) Salboni d) Jhansi"};   
        int i=(int)(Math.random()*10);
        System.out.println("Q.2 "+Ques2[i]+"        (₹ 2,000)");
        System.out.println("    ");
        System.out.println(opt1[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans1[i]))
        {
        System.out.println("Your Answer is Correct");
        S=S+1000;
        System.out.println("Money Earned = ₹ "+S);
        Thread.sleep(700);
        System.out.print("\f");
        ob.Question3(r,S);
        }
        else
        {
        System.out.println("Your Answer is Wrong "+r+".");
        System.out.println("The Correct Answer is:"+ans1[i]);
        System.out.println("Money Earned = ₹ "+S);
        System.out.println("You Have Lost the Quiz");
        System.out.println("                   Well Tried          ");
        Thread.sleep(2000);
        System.out.println("\f");
        }
    }
    public void Question3(String re,int Sc)throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        Set1 ob=new Set1();
        String cap[]=new String[11];
        System.out.println("The Next Question is");
        String Ques3[]={"Which of the following was the first paper currency issued by RBI?"," When was the Third Battle of Panipat fought ?"," Who composed the song 'Sare Jahan Se Acha' ?"," Who was the fourth President of Independent India ?","Who was the Seventh President of India ?" ," Who was the Elventh President of India ?","Who was the Third Prime Minister Of India ?","Who was the Tenth Prime Minister of India ?","Who was the Seventh Prime Minister of India ?"," Who wrote the book 'Gitanjali' ?","Where was Vinayak Damodar Savarkar Born ?","Which Indian Prime Minister Did Not Die In India ?","Who was the Second Prime Minister Of India ?"}; 
        String ans2[]={"Five Rupee Note","14 January 1761","Mohammad Iqbal","Varahagiri Venktagiri","Gaini Zail Singh","A P J Abdul Kalam","Indira Gandhi","P V Narsimha Rao","Rajiv Gandhi","Bal Gangadhar Tilak","Nasik","Lal Bahadur Shastri","Lal Bahadur Shastri"};  
        String opt2[]={"a) One Rupee Note b) Two Rupee Note c) Five Rupee Note d) Ten Rupee Note","a) 14 January 1761 b) 14 April 1761 c) 13 March 1763 d) 14 July 1761","a) Bankim Chandra b) Rabindranath Tagore c) Mohammad Iqbal d) Lala Lajpat Rai","a) Varahagiri Venktagiri b) Gaini Zail Singh c) A P J Abdul Kalam d) Rajendra Prasad","a) Varahagiri Venktagiri b) Gaini Zail Singh c) A P J Abdul Kalam d) Rajendra Prasad","a) Varahagiri Venktagiri b) Gaini Zail Singh c) A P J Abdul Kalam d) Rajendra Prasad","a) Indira Gandhi b) P V Narsimha Rao c) Rajiv Gandhi d) Lal Bahdur Shastri","a) Indira Gandhi b) Lal Bahdur Shastri c) Rajiv Gandhi d) P V Narsimha Rao"," a) Indira Gandhi b) Rajiv Gandhi c) P V Narsimha Rao  d) Lal Bahdur Shastri","a) Bal Gangadhar Tilak b) Mahtma Gandhi c) Jyotiba Phule d) Raja Ram Moham Roy "," a) Mumbai b) Pune c) Nasik d) Kolahapur "," a) P V Narasimha Rao  b) Rajiv Gandhi c)  Indira Gandhi  d) Lal Bahdur Shastri"," a) Indira Gandhi b) Lal Bahdur Shastri c) P V Narsimha Rao  d) Rajiv Gandhi"};   
        int i=(int)(Math.random()*10);
        System.out.println("Q.3 "+Ques3[i]+"       (₹ 5,000)");
        System.out.println("    ");
        System.out.println(opt2[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans2[i]))
        {
        System.out.println("Your Answer is Correct");
        Sc=Sc+3000;
        System.out.println("Money Earned = ₹ "+Sc);
        Thread.sleep(700);
        
        System.out.print("\f");
        ob.Question4(re,Sc);
       }
       else
       {
        System.out.println("Your Answer is Wrong "+re+".");
        System.out.println("The Correct Answer is:"+ans2[i]);
        System.out.println("Money Earned = ₹ "+Sc);
        System.out.println("You Have Lost the Quiz");
        System.out.println("            Well Tried          "); 
        Thread.sleep(2000);
        System.out.println("\f");
       }
       }
    public void Question4(String red,int Sco)throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        Set1 ob=new Set1();
        String cap[]=new String[100];
        String Ques4[]={"What was Sachin Tendulkar's highest score in all international cricket ?","Which bowler is most famous for his slingy action and deadly yorkers ?","What year was the first ever test match held ?","Who has the most test wickets without taking 5 Wickets in an innings ?","Who has the highest individual score in the World T20 ?","What happens when after the ball is bowled and hits the stumps, the bail goes into the air then lands back on top of the stumps ?","Who has the most Twenty20 International wickets ?","Who has the most test runs without scoring a hundred ?","How much of the ball needs to be hitting the stumps for a not out lbw to be overturned ?","Which umpire is most famously known for his unusual signalling style ?","What is the highest team total in test cricket ?","How many different ways can a batsman be dismissed ?","What is the name given when a batsman is dismissed off the first ball of a match ?","Who holds the record for the highest individual score in a first-class innings ?","Who has taken the most wickets in 50 Over World Cup matches ?","How many Cricket World Cups have taken place ? (Combined 50 & 20 Over World Cups)","How many players have scored hundreds in all 3 formats of international cricket ?","Which is not a way of being dismissed in cricket ?","How many players have taken a 5 Wicket Innings in all 3 formats ?","Who has the most ODI centuries when batting second ?","What year did Jacques Kallis play his last international match ?","How old was Sachin Tendulkar when he made his international debut ?","How many runs does a batter get if the ball hits the boundary rope on the full ?","How long did the longest recorded test match last for ?","Which international team has scored the most hundreds across all 3 formats ?","Who has the highest individual score in an Ashes Test ?","Who has the highest individual score in the 50 over world cup ?","How many people are on the field when the ball is considered to be 'alive' ?","What is the highest successful run chase in an ODI ?","Who has the most ducks in international cricket ?","Which bowler has the best innings figures in a test match ?","Who has the best bowling figures in Twenty20 Internationals ?","Who has played the most matches in Twenty20 Internationals ?","Who has umpired in the most test matches ?","Who contested the first ever day-night test in 2015 ?","How many hat-tricks have been taken in ODI cricket ?","Who has the highest individual score in a first class Innings",""};
        String ans3[]={"248 Not Out","Lasith Malinga","1877","Mike Hendrick","Brendon McCullum","Batsman is Not Out","Shahid Afridi","Shane Warne","Half","Billy Bowden","952","10","Royal Duck","Brian Lara","Glen McGrath","17","12","Six and Out","4","Virat Kohli","2014","16"};  
        String opt3[]={"a) 314 Not Out b) 248 Not Out c) 200 Out d) 200 Not Out"," a) Shahid Afridi b) Bret Lee c) Lasith Malinga d) Shoaib Akthar ","a) 1887 b) 1878 c) 1877 d) 1888","a) Glen McGrath b) Dayle Hadlee c) Brain McMillan d) Mike Hendrick"," a) Brendon McCullum b) Chris Gayle c) Alex Hales d) Rohit Sharma","a) Batsman is Out Bowled b) Batsman is Not Out c) Batsman is Out Run Out d) Dead Ball"," a) Saeed Ajmal b) Shahid Afridi c) Lasith Malinga d) Umar Gul"," a) Tim Southee b) Curtly Ambrose c) Shane Warne d) Rangana Hearth"," a) Three Fourth b) One Third c) Half d) All of It","a) Richard Kettleborough b) Billy Bowden c) Bruce Oxenford d) Nigel Llong"," a) 952 b) 992 c) 956 d) 958"," a) 9 b) 10 c) 12 d) 11"," a) Golden Duck b) Bronze Duck c) Diamond Duck d) Royal Duck"," a) Sir Donald Bradman b) Matthew Hayden c) Mahela Jaywardhane d) Brian Lara"," a) Chaminda Vas b) Wasim Akram c) Muttiah Murlitharan d) Glenn McGrath" ," a) 15 b) 17 c) 18 d) 16"," a) 11 b) 15 c) 17 d) 12"," a) Handling the ball b) Six and Out c) Timed Out d) Hit Wicket "," a) 3 b) 5 c) 6 d) 4 "," a) Steve Smith b) Virat Kohli c) Sachin Tendulkar d) Virendra Sehwagh"," a) 2010 b) 2013 c) 2015 d) 2014"," a) 15 b) 14 c) 13 d) 16 "};   
        int i=(int)(Math.random()*10+(int)(Math.random()*10));
        System.out.println("Q.4 "+Ques4[i]+"       (₹ 10,000)");
        System.out.println("    ");
        System.out.println(opt3[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans3[i]))
        {
        System.out.println("Your Answer is Correct");
        Sco=Sco+5000;
        System.out.println("Money Earned = ₹ "+Sco);
        Thread.sleep(700);
        System.out.print("\f");
        ob.Question5(red,Sco);
        
        }
        else
        {
        System.out.println("Your Answer is Wrong "+red+".");
        System.out.println("The Correct Answer is:"+ans3[i]);
        System.out.println("Money Earned = ₹ "+Sco);
        System.out.println("You Have Lost the Quiz");
        System.out.println("                   Well Tried              ");
        Thread.sleep(2000);
        System.out.println("\f");
        }   
       }
    public void Question5(String red1,int Scor)throws InterruptedException
       {
        Scanner sc=new Scanner(System.in);
        Set1 ob=new Set1();
        String cap[]=new String[11];
        String Ques5[]={"Duty Entitlement Pass Book (DEPS) is an scheme of Indian Government provided to ?","Which of the following currencies is not included in the Special Drawing Rights (SDR) Currency Basket ? "," Mars Atmosphere and Volatile Evolution Mission (MAVEN) is a space probe developed to study the atmosphere of Mars. It has been developed by ? "," Which of the following was the first planet to have its motions plotted across the sky during the second millennium BC? "," Which of the following was the first planet in the solar system to be visited by a Spacecraft ? "," India shares land borders with how many countries ? "," Which of the following countries is not larger than India in terms of geographical area ? "," Which Indian state share the longest land border with Bhutan ? "," Khardung La mountain pass is located in which Indian state ? "," At which of the following places was the first ever European township constructed in India ? "," Which of the following words is not included in the Preamble ? "," The Emergency Provisions of Indian Constitution have been borrowed from ? "," Who among the following was the chairperson of the Provincial Constitution Committee of the Constituent Assembly ? ","  "};
        String ans4[]={"Exporters","Indian Rupee","NASA","Venus","Venus","Seven","Indonesia","Assam","Jammu & Kashmir","Kochi","Dignity","Germany","Sardar Vallabh Bhai Patel",""};  
        String opt4[]={" a) Exporters b) Importers c) Wholesalers d) Retailers "," a) Indian Rupee b) British Pound c) Japanese Yen d) Chinese Renminbi "," a) ISRO b) CNSA c) NASA d) RFSA "," a) Mars b) Venus c) Jupiter d) Saturn "," a) Mercury b) Venus c) Mars d) Jupiter "," a) Six b) Seven c) Eight d) Nine "," a) Australia b) Brazil c) Canada d) Indonesia "," a) Assam b) Sikkim c) Arunachal Pradesh d) West Bengal "," a) Himachal Pradesh b) Uttarakhand c) Jammu & Kashmir d) Sikkim "," a) Kochi b) Chinsurah c) Surat d) Chennai "," a) Equality b) Liberty c) Dignity d) Justice "," a) Germany b) Japan c) USSR d) U.S.A "," a) Jawaharlal Nehru b) Sardar Vallabh bhai Patel c) Dr. B.R. Ambedkar d) J.B. Kripalani "};
        int i=(int)(Math.random()*10);
        System.out.println("Q.5 "+Ques5[i]+"          (₹ 20,000)");
        System.out.println("    ");
        System.out.println(opt4[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans4[i]))
        {
        System.out.println("Your Answer is Correct");
        Scor=Scor+10000;
        System.out.println("Money Earned = ₹"+Scor);
        Thread.sleep(700);
        System.out.print("\f");
        ob.Output(red1,Scor);
        }
        else
        {
        System.out.println("Your Answer is Wrong "+red1+".");
        System.out.println("The Correct Answer is:"+ans4[i]);
        System.out.println("Money Earned = ₹ "+Scor);
        System.out.println("You Have Lost the Quiz");
        System.out.println("                   Well Tried              ");  
        Thread.sleep(2000);
        System.out.println("\f");
        }   
       }
       public void Output(String red2,int Score)throws InterruptedException
       {
           Scanner sc=new Scanner(System.in);
           Set1 ob=new Set1();
           System.out.println("You Have Earned = ₹ "+Score+" At The End Of The FIRST SET");
           System.out.println("    ");
           System.out.println("Please Enter Anything to Play The Next Set");
           String SE=sc.nextLine();
           if(SE.equalsIgnoreCase(""))
           {
               System.out.println("\f");
               ob.Set2(red2,Score);
           }
           else
           {
               System.out.println("\f");
               ob.Set2(red2,Score);
           }
       }
    public void Set2(String red3,int Score1)throws InterruptedException
    {
        System.out.println("                           Welcome To The SECOND SET          ");
        Thread.sleep(3000);
        System.out.println("\f");
        Scanner sc=new Scanner (System.in);
        Set1 ob=new Set1();
        String cap[]=new String[100];
        String Ques6[]={" Which of the following is the largest brackish water lagoon in Asia ? "," Clouded Leopard National Park is located in which state ? "," Which of the following is not a primary greenhouse gas found in earth’s atmosphere ? "," Umiam Lake, also known as Barapani Lake, is located in which state ? "," Which of the following straits is located on the extreme southern tip of South America partly in Chile and partly in Argentina ? "," Lake Winnipeg is located in which of the following countries ? "," Which of the following is not a land locked country of Europe ? "," With which of the following countries of South East Asia, India shares a maritime boundary ? "," The Kachin Hills make a boundary between India and which of the following neighbours ? "," Which of the following states of India does not share a boundary with Myanmar ? "," The famous ‘Angkor Vat’ temple is situated in which of the following South-East Asian country ? ","  "};
        String ans5[]={"Chilika Lake","Tripura","Nitrogen Oxides","Meghalaya","Beagle Strait","Canada","Spain","Indonesia","Myanmar","Assam","Cambodia",""};  
        String opt5[]={" [A] Chilika Lake [B] Loktak Lake [C] Wular Lake [D] Nal Sarovar "," [A] Jammu & Kashmir [B] Uttarakhand [C] Sikkim [D] Tripura "," [A] Carbon dioxide [B] Methane [C] Water vapour [D] Nitrogen oxides "," [A] Meghalaya [B] Assam [C] Sikkim [D] Tripura "," [A] Dover Strait [B] Beagle Strait [C] Hudson Strait [D] Kara Strait ","[A] Brazil [B] Canada [C] Russia [D] Japan"," [A] Hungary [B] Kosovo [C] Czech Republic [D] Spain "," [A] Indonesia [B] Malaysia [C] Singapore [D] Vietnam "," [A] Bhutan [B] Myanmar [C] Nepal [D] China "," [A] Arunachal Pradesh [B] Manipur [C] Nagaland [D] Assam "," [A]Thailand [B]Phillippines [C]Cambodia [D]Vietnam ","  "};
        int i=(int)(Math.random()*10);
        System.out.println("Q.6 "+Ques6[i]+"        (₹ 40,000)");
        System.out.println("    ");
        System.out.println(opt5[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans5[i]))
        {
        System.out.println("Your Answer is Correct");
        Score1=Score1+20000;
        System.out.println("Money Earned = ₹"+Score1);
        Thread.sleep(700);
        System.out.print("\f");
        ob.Question7(red3,Score1);
        }
        else
        {
        System.out.println("Your Answer is Wrong "+red3+".");
        System.out.println("The Correct Answer is:"+ans5[i]);
        System.out.println("Money Earned = ₹ "+Score1);
        System.out.println("You Have Lost the Quiz");
        System.out.println("                   Well Tried              ");  
        Thread.sleep(2000);
        System.out.println("\f");
        }   
    }
    public void Question7(String red4,int Score2)throws InterruptedException
    {
        Scanner sc=new Scanner (System.in);
        Set1 ob=new Set1();
        String cap[]=new String[100];
        String Ques7[]={"The power of a lens is measured in ? "," Which one of the following types of Laser is used in Laser Printers ? "," Albert Einstein was awarded Nobel Prize for his path-breaking research and formulation of the ? "," L.P.G. is a hydrocarbon consisting of a mixture of ? "," Amalgam’ is a term used for an alloy of a metal with ? "," Falkland Island is a disputed territory between ? "," Which of the following mountain ranges form the longest mountain chain in the world ? "," The famous ‘Hornbill festival’ is celebrated in which of the following States of India "," The Andaman and Nicobar Islands are submerged parts of mountain range called ? "," The famous hill-station ‘Kodaikanal’ lies in ? "," Which of the following mountain ranges form a dividing line between the Ganges Plain and the ? "," Which of the following Mountain passes forms the ‘tri-junction’ of India,China and Myanmar ? "," The largest number of Tiger Reserves are located in ","  "};
        String ans6[]={"diopters","Semiconductor Laser","Laws of Photo-Electric Effect","Propane and Butane","Mercury","Argentina and UK","The Andes of South America","Nagaland","Arakan Yoma","Palani hills","Vindhya","Diphu","Madhya Pradesh",""};  
        String opt6[]={" [A]diopters [B]aeon [C]lumen [D]candela "," [A]Semiconductor laser [B]Excimer Laser [C]Dye Laser [D]Gas Laser "," [A]Theory of Relavitity [B]Laws of Photo-Electric Effect [C]Principle of Wave-Particle Duality [D]Theory of Critical Opalescence "," [A]Methane and Butane [B]Propane and Butane [C]Ethane and Propane [D]Ethane and Butane "," [A]Copper [B]Mercury [C]Lead [D]Aluminium "," [A]Chile and Equador [B]West Indies and Spain [C]Uruguay and France [D]Argentina and UK "," [A]The Rockies of North America [B]The Andes of South America [C]The Transantarctic Range [D]The Great Dividing Range of Australia "," [A]Nagaland [B]Mizoram [C]Assam [D]Meghalaya "," [A]Arakan Yoma [B]Pegu Yoma [C]Askai Chin [D]Tien Shan "," [A]Nilgiri hills [B]Palani hills [C]Cardamom hills [D]Javadi hills "," [A]Aravalli [B]Vindhya [C]Satpura [D]Ajanta "," [A]Nathu La [B]Jelep La [C]Bomdi La [D]Diphu "," [A]Karnataka [B]Andhra Pradesh [C]Madhya Pradesh [D]West Bengal "};
        int i=(int)(Math.random()*10);
        System.out.println("Q.7 "+Ques7[i]+"        (₹ 80,000)");
        System.out.println("    ");
        System.out.println(opt6[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans6[i]))
        {
        System.out.println("Your Answer is Correct");
        Score2=Score2+40000;
        System.out.println("Money Earned = ₹"+Score2);
        Thread.sleep(700);
        System.out.print("\f");
        ob.Question8( red4,Score2);
        }
        else
        {
        System.out.println("Your Answer is Wrong "+red4+".");
        System.out.println("The Correct Answer is:"+ans6[i]);
        System.out.println("Money Earned = ₹ "+Score2);
        System.out.println("You Have Lost the Quiz");
        System.out.println("                   Well Tried              ");  
        Thread.sleep(2000);
        System.out.println("\f");
        }   
    }
    public void Question8(String S,int Score3)throws InterruptedException
    {    
        Scanner sc=new Scanner(System.in);
        Set1 ob=new Set1();
        String cap[]=new String[11];        
        String Ques8[]={" Which of the following is not an event in ancient Indian history in BC era ? ","Which of the following was most probably the first metal to be used in India ?","Which of the following terms is not associated with a tool tradition of ancient India / World ?","In stone age, the Microliths were most commonly found in which of the following ages ?","Which of the following features of Indian temples resembles pylons of the Egyptian temples ?"," Which of the following states is sole producer of agate, chalk, and perlite in India ? "," Which of the following states is India’s largest Bauxite producer ? "," India’s first Uranium Mine is located at which among the following places ? "," Which of the following canals is considered to be an important link between the developed countries and the developing countries ? "," Which of the following countries is not a part of Melanesia region in the pacific ocean ? "," Which of the following is the official language in Argentina ? ","  "};
        String ans7[]={"Fourth Buddhist Council","Copper","Grotian","Mesolithic","Gopura","Gujrat","Odisha","Jadugauda","Suez Canal","Kiribati","Spanish",""};  
        String opt7[]={"[A] Foundation of the Indo-Greek empire [B] Beginning of Vikram samvat Era [C] Fourth Buddhist Council [D] Hathigumpha inscription by Kharvela "," [A] Iron [B] Copper [C] Gold [D] Silver "," [A] Mousterian [B] Acheulean [C] Oldowan [D] Grotian ","[A] Paleolithic [B] Mesolithic [C] Neolithic [D] Chalcolithic"," [A] Lat [B] Vimana [C] Gopura [D] Shikhara "," [A] Rajasthan [B] Karnataka [C] Gujarat [D] Tamil Nadu "," [A] Odisha [B] Jharkhand [C] Rajasthan [D] Karnataka "," [A] Jadugauda [B] Tummalapalle [C] Pichli [D] Dalbhum "," [A] Panama Canal [B] Suez Canal [C] Kiel Canal [D] Grand Canal "," [A] Vanuatu [B] Solomon Islands [C] Fiji [D] Kiribati "," [A] Portuguese [B] French [C] Spanish [D] Dutch ","  "};
        int i=(int)(Math.random()*10);
        System.out.println("Q.8 "+Ques8[i]+"        (₹ 1,60,000)");
        System.out.println("     ");
        System.out.println(opt7[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans7[i]))
        {
        System.out.println("Your Answer is Correct");
        Score3=Score3+80000;
        System.out.println("Money Earned = ₹"+Score3);
        Thread.sleep(700);
        System.out.print("\f");
        ob.Question9(S,Score3);
        }
        else
        {
        System.out.println("Your Answer is Wrong "+S+".");
        System.out.println("The Correct Answer is:"+ans7[i]);
        System.out.println("Money Earned = ₹ "+Score3);
        System.out.println("You Have Lost the Quiz");
        System.out.println("                   Well Tried              ");  
        Thread.sleep(2000);
        System.out.println("\f");
        }     
    }
    public void Question9(String Si,int Score4)throws InterruptedException
    {    
        Scanner sc=new Scanner(System.in);
        Set1 ob=new Set1();
        String cap[]=new String[11];        
        String Ques9[]={" In 1398, when Timur invaded India, the ruler of Delhi Sultanate was ? "," “Silver Tanka” and “Copper Jital” coins were introduced by ? "," In 1293 A.D., Marco Polo, an Italian traveller, visited which Indian Kingdom ? "," The famous Meenakshi Amman Temple in Madurai was built during which dynasty ? "," Which ruler sent two of his brothers Ulugh Khan and Nusrat Khan to invade Gujarat ? "," Who among the following introduced the Zabti system and Dahshala system ? "," Which Mughal Ruler had higher number of Hindus as Mansabdars than Muslims under his administration ? "," Ruqaiya Sultan Begum was the wife of which Mughal Ruler ? "," Which among the following phenomena has been largely responsible for the recent drought in Somalia and northern Kenya ? "," The pointer or arrow of the magnetized needle of a compass indicates which among the following ? ","  "};
        String ans8[]={"Mahmud Shah Tughluq","Iltutmish","Kakatiya","Pandyas","Alauddin Khilji","Raja Todar Mal","Aurangzeb","Akbar","La Nina","Magnetic South Pole","",""};  
        String opt8[]={" [A] Mahmud Shah Tughluq [B] Jalal ud din Firuz Khilji [C] Aram Shah [D] Ghiyas-ud-din Balban "," [A] Iltutmish [B] Abu Bakr Shah [C] Firuz Shah Tughlaq [D] Sikander Lodi "," [A] Kakatiya [B] Satavahana [C] Pandyan [D] Chera "," [A] Pandyas [B] Chola [C] Chera [D] Pallava "," [A] Alauddin Khilji [B] Sikandar Lodi [C] Muhammad Shah [D] Firuz Shah Tughlaq "," [A] Raja Todar Mal [B] Firuz Shah Tughlaq [C] Raja Man Singh I [D] Ibrahim Lodi "," [A] Akbar [B] Aurangzeb [C] Jahangir [D] Shah Jahan "," [A] Humayun [B] Jahangir [C] Akbar [D] Shah Jahan "," [A]El Nino Southern Oscillation [B]La Nina [C]Indian Ocean Dipole [D]A collective impact of all the above three "," [A]Geographic North Pole [B]Magnetic North Pole [C]Geo-magnetic North Pole [D]Magnetic South Pole "};
        int i=(int)(Math.random()*10);
        System.out.println("Q.9 "+Ques9[i]+"        (₹ 3,20,000)");
        System.out.println("     ");
        System.out.println(opt8[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans8[i]))
        {
        System.out.println("Your Answer is Correct");
        Score4=Score4+160000;
        System.out.println("Money Earned = ₹"+Score4);
        Thread.sleep(700);
        System.out.print("\f");
        System.out.println("You have Earned : ₹"+Score4);
        System.out.println("   ");
        System.out.println("                     Welcome To The Last And Final Set of The Quiz Show        ");  
        Thread.sleep(1000);
        System.out.println("\f");
        System.out.println(" These are some Instructions for the Last Set ");
        System.out.println(" Please Read It CAREFULLY");
        System.out.println(" 1. You need to put only Option Alphabet as your Answer");
        System.out.println(" It means that if the Question is,'What is the  Capital of India ?'");
        System.out.println(" And options Are ");
        System.out.println("        ");
        System.out.println(" [A] Mumbai  [B] New Delhi [C] Kolkata [D] Bangluru ");
        System.out.println(" So Put The Option Alphabet ");
        System.out.println(" B");
        System.out.println(" Your Answer is Correct ");
        System.out.println(" Please Dont Put Bracket With The Alphabets");
        Thread.sleep(3000);
        System.out.println("\f");
        ob.Set3(Si,Score4);
        }
        else
        {
        System.out.println("Your Answer is Wrong "+Si+".");
        System.out.println("The Correct Answer is:"+ans8[i]);
        System.out.println("Money Earned = ₹ "+Score4);
        System.out.println("You Have Lost the Quiz");
        System.out.println("                   Well Tried              ");  
;        Thread.sleep(2000);
        System.out.println("\f");
        }     
        }
      public void Set3(String Sit,int Score5)throws InterruptedException
      {
          Set1 ob=new Set1();
       Scanner sc=new Scanner (System.in);
       System.out.println("Please Enter Anything to Play The Next Set ");
       String sy=sc.nextLine();
       if(sy.equalsIgnoreCase("   "))
       {
            System.out.println("\f");
            ob.Question10(Sit ,Score5);
       }
       else
       {
           System.out.println("\f");
           ob.Question10(Sit,Score5);
       }
       }
       public void Question10(String Sit1,int Score6)throws InterruptedException
       {
          Scanner sc=new Scanner(System.in);
        Set1 ob=new Set1();
        String cap[]=new String[11];        
        String Ques10[]={" In 1398, when Timur invaded India, the ruler of Delhi Sultanate was ? "," “Silver Tanka” and “Copper Jital” coins were introduced by ? "," In 1293 A.D., Marco Polo, an Italian traveller, visited which Indian Kingdom ? "," The famous Meenakshi Amman Temple in Madurai was built during which dynasty ? "," Which ruler sent two of his brothers Ulugh Khan and Nusrat Khan to invade Gujarat ? "," Who among the following introduced the Zabti system and Dahshala system ? "," Which Mughal Ruler had higher number of Hindus as Mansabdars than Muslims under "};
        String ans9[]={"Mahmud Shah Tughluq","Iltutmish","Kakatiya","Pandyas","Alauddin Khilji","Raja Todar Mal","Aurangzeb","Akbar","La Nina","Magnetic South Pole","",""};  
        String opt9[]={" [A] Mahmud Shah Tughluq [B] Jalal ud din Firuz Khilji [C] Aram Shah [D] Ghiyas-ud-din Balban "," [A] Iltutmish [B] Abu Bakr Shah [C] Firuz Shah Tughlaq [D] Sikander Lodi "," [A] Kakatiya [B] Satavahana [C] Pandyan [D] Chera "," [A] Pandyas [B] Chola [C] Chera [D] Pallava "," [A] Alauddin Khilji [B] Sikandar Lodi [C] Muhammad Shah [D] Firuz Shah Tughlaq "," [A] Raja Todar Mal [B] Firuz Shah Tughlaq [C] Raja Man Singh I [D] Ibrahim Lodi "," [A] Akbar [B] Aurangzeb [C] Jahangir [D] Shah Jahan "," [A] Humayun [B] Jahangir [C] Akbar [D] Shah Jahan "," [A]El Nino Southern Oscillation [B]La Nina [C]Indian Ocean Dipole [D]A collective impact of all the above three "," [A]Geographic North Pole [B]Magnetic North Pole [C]Geo-magnetic North Pole [D]Magnetic South Pole "};
        int i=(int)(Math.random()*10);
        System.out.println("Q.10 "+Ques10[i]+"        (₹ 6,40,000)");
        System.out.println("     ");
        System.out.println(opt9[i]);
        cap[i]=sc.nextLine();        
        if(cap[i].equalsIgnoreCase(ans9[i]))
        {
        System.out.println("Your Answer is Correct");
        Score6=Score6+320000;
        System.out.println("Money Earned = ₹"+Score6);
        Thread.sleep(700);
        System.out.print("\f");
        
        }
        else
        {
        System.out.println("Your Answer is Wrong "+Sit1+".");
        System.out.println("The Correct Answer is:"+ans9[i]);
        System.out.println("Money Earned = ₹ "+Score6);
        System.out.println("You Have Lost the Quiz");
        System.out.println("                   Well Tried              ");  
        Thread.sleep(2000);
        System.out.println("\f"); 
       }
}
}

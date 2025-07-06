package org.example;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class asciiToPrint
{
    private final Scanner keyboard = new Scanner(System.in);


    String char1 = " .OMMMN:   'do;cOXl  'c:.                                                           .    .xWl..'.      .kMM0'\"";
    int asciiHeight1 = 3;

    public static String main(String ascii, String charLength, int asciiHeight)
    {
        List<String> tempList  = new ArrayList<String>();
        String completeString = "";
        for (int i = 0; i < charLength.length(); i++)
        {
            tempList.add(ascii.substring(i));
            int counter = 0;
            if (ascii.substring(i).equals(" "))
            {
                counter = counter + 1;
                if (counter >= 50)
                {
                    break;
                }
            }
            if (i == charLength.length() - 1)
            {
                completeString = "System.out.println(\"" +  tempList + "\");";
            }
        }
        return completeString;
    }
}

//System.out.println("                                                .....'''''''''''... ");
//            System.out.println("                                    ..,:lodxxkkO0KKKXXXXXXXXNNNNNXKOxdolc;'.");
//            System.out.println("                               .;ldk0XNX0Oxdolc::;,''''''''''',;;:clodxO0KKKkdoc:,.");
//            System.out.println("                          .;lx0KKOxl:,'..    ,l;                        ..';coxOXNXOxo:'.");
//            System.out.println("                     .;ldOK0ko:'.            'OX:            .;.             .';::coOXWNKko;.");
//            System.out.println("                .'cdOXNKOxl,.              ;l',0K;   ..     .dNc ..       .cddxKXO:  .;lkXWWXkl,.");
//            System.out.println("             .;d0NMNOodkxooO0xl:,.         ,00;;K0,  lXl    .OX;;Kd.   .cdxo;;k0oo0x,    .:xKWMW0o,");
//            System.out.println("          .,dKWMW0o;:d0d'  ,xXNOolc:,..co,  .xKoc00, ,c.    '0K;:k:;xxxko,. .OX:  'xKo.     .:kNMMNk;");
//            System.out.println("        .lONMMNk:':xkl.      ,oo;  .:okXNo.   c0OdK0lxO'    .;;.  'xXOc.    lWx.   .lKk.       'dXMMNd.");
//            System.out.println("      .lKWMMNk,.cOk:.          .cc,   .;oxdc;,,:OKXWKXN:     .':oddl,       cXO,     ,O0:        'xNMWO;");
//            System.out.println("     ,OWMMW0:  :NO.              .;c'     ,lolodOXNKKXNkcclolloc,.           cX0'     .dXd.        ;OWMNx.");
//            System.out.println("    :KMMMWx.   lWd               .:0Kc.         ''....';;;,.                'OWN0o,.,,. lXk.        .xWMWO'");
//            System.out.println("  .lNMMMNo.   .kWl       .;lllc:,;xNKl.                                    .c0NMMKkKWO,..lXx.        .dWMWd.");
//            System.out.println("  cNMMMWd.    :XO'       :ONWKxllldKWNo.                                     .lo::OWN0Okc,kN:         .kMMX;");
//            System.out.println(" .kMMMM0'    .dWo     .lkXWKk0k'  .';cc.                                         .:xNXo'  dWo          :NMWd");
//            System.out.println(" .OMMMWo      ;0Oc.  ,OW0xkc. .                                                    :Oc    lWd .:.      '0MMO.");
//            System.out.println(" .OMMMN:   'do;cOXl  'c:.                                                           .    .xWl..'.      .kMM0'");
//            System.out.println(".xMMMN:   .:x0XX0o'                                                          ..         lXk. ,cc,     '0MMK,");
//            System.out.println("  lWMMWo      .':kNO'                 .....                        .',;clllllx0Kx;      ,KKlcloooc'    cNMMK,");
//            System.out.println("  'OMMM0,  ... .lKNk' ..';::,.  ;oxdlcllkK0Oxl:.                ,odookNWWXl.'xWO;.      ,KK:.'',;;'   .OMMMO.");
//            System.out.println("   'OWMWx.  ..'..oXKxx0XNNXKx'  .cXK;   ;XMNd:x0d.             ;XK;   cO0c..:0K;         oNd..lo;.   .xWMMK;");
//            System.out.println("    .kWMWx.   .,cc,,:dKWKl..      ;OOc.. ':,. .oNx.            '0Xxc;;;coloodc.          cNKc;c;.   .xWMMK;");
//            System.out.println("     .oXMWO'   .,'  .oNWO,         .;lollllllllxN0'            .kWx::cc:;,..          .;oKXdllll,  ;0WMNk'");
//            System.out.println("       ;0WMXl.       cXN0c.             ........dKc            .oo.                 'dKXKX0l,. ..'xNMXd,");
//            System.out.println("        .oXMW0c.   ,ldxKXc                       ...',......';l;.                 'xK0kd:',:l,.'dXMXx'");
//            System.out.println("          .l0NWKo' ...lO0dc;'.                      ;ddk0KKXX0d,               ..,o0X0kd:.  .;xNMXd'");
//            System.out.println("            .;xXMNkc',cx0NMWNOo:,...                   ;d0W0l.          .';:oxkk0XOdoollc:lxOKXNXd,.");
//            System.out.println("            .;lOWMMWWWMMMMMMMMMMWNK0kl:;,'..          ;dkO0ko,     .,cdOXWWWO:'.;0Kkkkxxxo:,....',;;,;:,");
//            System.out.println("            ,ONMMMMMMMMMMMMMMMMMMMMMMMMMWWNKkl:;,'..  ','...,'..;lx0NMMNKkxkklclxXNK0Oxdxo,'..       .c0x.");
//            System.out.println("              ,ldk0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXKOkdolloodk0XNNX0ko:,:ollkNMMMMMMMNKKKXNNXKkc.   ,d0Nk.");
//            System.out.println("                   .,lxKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKdc;,''..  .dKd.cWMMMMMMMMMMMMMMMMMMMXdlkNMMMNk;");
//            System.out.println("                       .,:ldk0KXWMMMMMMMMMMMMMMMMMMMMMMMMMMXd'        .:, .kMMMMMMMMMMMMMMMMMMMMMMWX0Oxo:;.");
//            System.out.println("                ..';:lok0NWMMMMMMMMMMMMMMMMMMMMXxc'.        oWMMMMMMMMMMMMMWXKOkxdl:,..");
//            System.out.println("                                      ..;ldk0KNWWMMMMMMMMMMMMMMMN0kdc;...:KMMMMMMMWNKOdl:,..");
//            System.out.println("                                                                   .....'',,'.");
//


//            System.out.println("                                 .....'''''''''''''.....  ");
//            System.out.println("                         .''''''''''''...............'''''''''.. ");
//            System.out.println("                    .','''...                              ...''''''..");
//            System.out.println("                 .,,,'.               ,.           .            ..,lo;,,'.");
//            System.out.println("              ',,'..'..             . .:.   .     ':. .     .','';odl, .',,,. ");
//            System.out.println("           .,;,. ';;,:oc,''..       ';.':.  '.    ,:.':..'.,;'. .:; .:,    .,;,.  ");
//            System.out.println("         .,;'..,;,.   .,:;,',,,'     ,:.,:. ..    .' .;;oc,.   .:;   .:,      ';,. ");
//            System.out.println("        ':' .;;.        .,;'  .,;,..  ,:.;,.:,    .',,,'.      .c.    .:,       .;;.");
//            System.out.println("      .:;   ;:             ,:.   .',,,'locl;cc,'''''.          .:,     .:'        ':.");
//            System.out.println("      ;;   .:,             .dl.      .'..........               :xl'.;;..:'        .:.  ");
//            System.out.println("     ':.   .c.      .;;'''';od'                                 .ox;;dc...:'        ,:. ");
//            System.out.println("    .:,    ,:     ..cxxc. ..'c:.                                 .' 'lco: ,:. .     .:' ");
//            System.out.println("    'c.    ,:.   .c;cc''.                                            .'.  ':. ..     ;, ");
//            System.out.println("    ,:  .,'.,..   .                                                      .:, .'.     ;, ");
//            System.out.println("    ,:   'col;.                                              .....       ;c.        .c'");
//            System.out.println("    'c. ....;dx:     ..   .''''',;;'.                  .':dko,'';l,      cl'''''''. ;; ");
//            System.out.println("     :, .',',lOx;'''co:.  .ll...;0MXl,,.            .,,,';OWd   ;:.      ;;  .''.. ,:. ");
//            System.out.println("     .c.  .'..,'.';;,.     'c'   ,dl. .:,           ,o,...'c:,,,,.       ;l'..''. ,:.");
//            System.out.println("      .:'   .'. .cko.       .,''',''''':l.          ,o;''''''..        .,c;'''''.;:.            ");
//            System.out.println("       .;;.     .,ox'           .....   '.         ...                ;xd;','. .:;.");
//            System.out.println("         .;;.  .,.'c.                      ;oc;;,;oo.                ;Ok;  .',;:' ");
//            System.out.println("           .,;;,.':kOdc;'..                .:c::::;.        ..,:clol;,;,.  .,c, ");
//            System.out.println("            ,dXWNNWMMMMMWX0kdl:,..          .,:lo:,'.  .,lx0KXNkccxK0kkdlc:;c;'''''. ");
//            System.out.println("          .oKWMMMMMMMMMMMMMMMMMWNK0kxoc:,'.,::;'.,coooxKWMWNXWWkccxNMWX00Kk:'.   .'co' ");
//            System.out.println("           .';cokKNMMMMMMMMMMMMMMMMMMMMMWNXXK00KXNWWNK0kdllxXWMMMMMMMMWNNWWWNKxc.'l0NKo, ");
//            System.out.println("                 .':ok0NMMMMMMMMMMMMMMMMMMMMMMMMMNx;...  'kXkOWMMMMMMMMMMMMMMMMWXXMMMMWKo.   ");
//            System.out.println("                      .':okKNWMMMMMMMMMMMMMMMMMMMMXxc,.  .;'.dMMMMMMMMMMMMMMMMMMNX0koc;'. ");
//            System.out.println("                           .';coxO0XNWWMMMMMMMMMMMMMMWKkoc,.:KMMMMMMMMMMWXOxol:;'.  ");
//            System.out.println("                                  ...',;:clodxxkO0KXNWMMMMWXNWMWNXKOxoc;'.  ");
//            System.out.println("                                                  ...,:cllllc:;,'..  ");

//
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");

//        System.out.println("                                             @");
//        System.out.println("                                 @@@  @  #@@@ +  ");
//        System.out.println("                               @         .  % @ ");
//        System.out.println("                            -@#  +@@@@@@@#     @  ");
//        System.out.println("               #@@@@@@@@@@@@                 @: @  ");
//        System.out.println("    @@       @@         :@@@@@                  @ @@@#    #@@ ");
//        System.out.println("   =@     .@@             @@@@@                    %@@@       @@ ");
//        System.out.println("   =@@@@@+@@#             .@@@@                                @ ");
//        System.out.println("     .@@@@@@@@@            @@@@                                @  ");
//        System.out.println("        @@@@@%             %@@@                                @");
//        System.out.println("        @#@@@@           =@@@@                            @.@%@.@ ");
//        System.out.println("         @@@ @@         @@ @                           @   = @  @@@@@ ");
//        System.out.println("         @@%   @@@@@@@@@@                                @ @ ");
//        System.out.println("         @@@                                            +  @ @ ");
//        System.out.println("         @@@                                          ");
//        System.out.println("         @@@                                           @@          @ ");
//        System.out.println("         @@@                                          #@@        %@@@  ");
//        System.out.println("         @@@@                                         @@@@      @@@@@ ");
//        System.out.println("         @@@@                                         @@@@@@@@@@@@@@@ ");
//        System.out.println("        @@@@-@%                                      @@@@@@@@@@@@@%@@  ");
//        System.out.println("      @ @     @%@@=                                  @@@@@@@@@@@@@@@@ =@ ");
//        System.out.println("     *% %                                          %@@@@@@@@@@@@@@@@@@  ");
//        System.out.println("       @                                             @@@@@@@@@@@@@@@@@@@ ");
//        System.out.println("                                                   @-%@@@@@@@@@@@@@@@-  ");
//        System.out.println("     @@% @                                            @@@@@@@@@@@@@@@@ ");
//        System.out.println("    @@@ @@@                                           ::@@@@@@@@@@@.  * ");
//        System.out.println("      .-.                                            @    +@@@@@@  ");
//        System.out.println("      .   @@              @                                  @=   * ");
//        System.out.println("     : # @@@@@              @                              @@.     - ");
//        System.out.println("    %@ @                      *@                       @@@-       # ");
//        System.out.println("       @ @ @  @ @.@ .@@@.     @@.=+@@@@@@@@@@@@@@@@@ %@ -+       @ ");



//
//boolean asciiInput = false;
//boolean maxAscii = false;
//boolean height = false;
//List<String> asciiString = new ArrayList<String>();
//int maxAsciiLength = 0;
//int heightValue = 0;
//
//
//    if (!asciiInput && !maxAscii && !height)
//        {
//
//        //prompt for ascii string
//        while (!asciiInput) {
//        System.out.print("ascii string");
//            asciiString.add(input.nextLine());
//
//        if (asciiString.size() > 1)
//        {
//asciiInput = true;
//        }
//        }
//        }
//        if (asciiInput)
//        {
//        //prompt for ascii.length
//        while (!maxAscii) {
//        System.out.print("please input the longest ascii string");
//String stringvalue = input.nextLine();
//maxAsciiLength = stringvalue.length();
//            if (maxAsciiLength > 0) {
//maxAscii = true;
//        }
//        }
//        }
//        if (asciiInput && maxAscii)
//        {
//
//        //prompt for ascii.height
//        while(!height)
//        {
//        System.out.print("please input the number of lines present in the ascii image");
//heightValue = Integer.parseInt(input.nextLine());
//        if(heightValue > 0)
//        {
//height = true;
//        }
//        }
//        }

//
//List<String> newCat = new ArrayList<String>(List.of(cat.split("1")));
//
//List<String> tempList  = new ArrayList<String>();
//String completeString = "";
//        for (int i = 0; i < maxAsciiLength; i++)
//        {
//        tempList.add(asciiString.get(i));
//int counter = 0;
//            if (asciiString.get(i).equals(" "))
//        {
//counter = counter + 1;
//        if (counter >= 50)
//        {
//        break;
//        }
//        }
//        if (i == maxAsciiLength - 1)
//        {
//completeString = "System.out.println(\"" +  tempList + "\");";
//        }
//        }
//        System.out.println(completeString);



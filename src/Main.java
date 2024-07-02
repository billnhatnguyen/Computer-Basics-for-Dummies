/** Bill Nhat Nguyen
 * Monday, June 12, 2023
 * Computer Science ISU
 * The following application will show all skills learnt throughout the semester in the form of a mega menu system leading to multiple lessons and quizzes.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int choice;
        int points = 0 ; //used for the points based system
        final int CORRECT_ANSWER = 1000; //If user gets multiple choice answer right1

        final int PITY_POINTS = 500; //If user gets multiple choice answer wrong
        int congratulationPhrase; //Used to randomize computer output when user gets multiple choice answer right
        int wrongAnswerPhrase;//Used to randomize computer output when user gets multiple choice answer wrong
        int hollJersey = 0, vigBurger =0,  caprara=0, cureCham=0, fordMustang=0, stanleyCup=0; //Used for inventory section of the shop
        int pointsRequired, coinGameBet, headsOrTails, coinFlip; //Gambling game variables



        do {
            System.out.println("****************************************************");
            System.out.println("*                  Main Menu                       *");
            System.out.println("****************************************************");
            System.out.println("*                1. Start Game                     *");
            System.out.println("*               2. Instructions                    *");
            System.out.println("*               3. About Program                   *");
            System.out.println("*              4. Leave a review                   *");
            System.out.println("*                  5. Exit                         *");
            System.out.println("****************************************************");

            System.out.print("What would you like to do? ");
            choice = input.nextInt();

            if (choice == 1) //start game portal1

            {
                do {
                    System.out.println("\n\n****************************************************");
                    System.out.println("*                    Game Menu                     *");
                    System.out.println("****************************************************");
                    System.out.println("*                     1. Learn                     *");
                    System.out.println("*                     2. Quiz                      *");
                    System.out.println("*                     3. Shop                      *");
                    System.out.println("*                     4. Exit                      *");
                    System.out.println("****************************************************");

                    System.out.print("What would you like to do? ");
                    choice = input.nextInt();

                    if (choice == 1) { //What topic do you want to learn portal
                        do {
                            System.out.println("\n\n****************************************************");
                            System.out.println("*                   LEARNING HUB                   *");
                            System.out.println("****************************************************");
                            System.out.println("*                1. Computer Memory                *");
                            System.out.println("*                2. Hard Drive                     *");
                            System.out.println("*                3. CDs                            *");
                            System.out.println("*                4. BIOS                           *");
                            System.out.println("*                5. CD-Burners                     *");
                            System.out.println("*                6. Rise of AI                     *");
                            System.out.println("*                7. Exit                           *");
                            System.out.println("****************************************************");

                            System.out.print("What would you like to do? ");
                            choice = input.nextInt();

                            if (choice == 1) { //Computer Memory Information
                                System.out.println("In a computer, everything works together, with the computer’s memory serving as one of the" +
                                        "\n most important parts of the team,as from the very second, your computer is turned on till you turn" +
                                        "\n it off, your CPU is constantly using memory.In terms of computer memory, there are two main types, " +
                                        "\ntemporary storage areas, and permanent storage areas. As it begins by opening data stored on the " +
                                        "\nread only memory, to the very second it everything is loaded or open where information is placed " +
                                        "\ninto the computer’s RAM (temporary storage area) So that the CPU can access information easily, " +
                                        "\n shuffling data millions of times every second.When something is closed, the accompanying files " +
                                        "\nare deleted from the ram to make room for new data. Along with RAM being a temporary storage area, " +
                                        "\ncomes cache, another temporary storage device, Ram speed is controlled by bus width and bus speed," +
                                        "\nwith bus width referring to the number of bits that can be sent to the CPU at a time, and bus speed " +
                                        "\nreferring to how many groups of bits can be sent every second. Mentioned above, the other main memory " +
                                        "\ntype is permanent storage areas, including, ROM/BIOS, removable drives," +
                                        "\n network/internet storage and hard drive, used to save files or applications, " +
                                        "\nfor a long period of time, and these storage areas don’t get wiped when turning off the computer. \n");

                            } else if (choice == 2) { //Hard drive info
                                System.out.println("\nInvented in the 1950s, and storing ever so changing digital information, in a relatively permanent form, " +
                                        "\nhard drives are essential in computers as they allow them to retain information, even when the " +
                                        "\ncomputer shuts down or loses power. Storing data on disks, as collection of bytes, referred to" +
                                        "\n as files, is how hard drives save information. Hard drives vary in performance based on two factors"+
                                        "\n data rate, referring to how many bytes/second a drive can deliver to the CPU and seek time" +
                                        "\nreferring to the amount of time between a CPU’s request for a file and the first byte of that file " +
                                        "\n being sent to the CPU. Inside the hard drive lies an arm that holds read/write heads that spin from" +
                                        "\n hub to edge about 50 times per second, and used to spin the platters which spin when the drive is +" +
                                        "\nOperating.On the surface of platters, lay sectors and tracks, which store " +
                                        "\ndata clustered together into clusters, which \n ");

                            } else if (choice == 3) { //CD information
                                System.out.println("\tMade of an injection-moulded piece of clear polycarbonate plastic, along with a reflective " +
                                        "\naluminium layer covering bumps, and acrylic layers, a CD is used to retain information, and is vastly " +
                                        "\nrenowned as the standard medium for distributing information reliably. Having bumps about 0.5 micrometres " +
                                        "\nwide, and data tracks about 3.5 miles long when stretched out, a CD stores information by encoding the " +
                                        "\ninformation in tightly packed spiral tracks moulded in the top of polycarbonate layers. USing interleaving " +
                                        "\nto solve the problems of scratches or specks on the CDs to protect damaged packets of bytes from being " +
                                        "\nmisread, by storing data non-sequentially around the disc circuit. Depending on what track is being read, " +
                                        "\nthe CD spins at different speeds, as the spindle motor moves outwards, slowing down the spinning " +
                                        "\nso that the bumps travel past the laser at constant speeds, and so data is being read at a constant rate.\n");

                            } else if (choice == 4) { //BIOS information
                                System.out.println("Used for basic input/output systems and one of the most common uses of Flash memory, in your computer " +
                                        "\nthe BIOS makes sure all hard drives, chips ports and CPU function in unison. There are three types of software " +
                                        "\nnecessary for your computer to cooperate successfully, the operating system, applications and the BIOS, having " +
                                        "\n a number of different roles within it, the most important of those roles being to load the operating system." +
                                        "\n Other tasks include, performing a power on self test, to see if everythings working, activating " +
                                        "\nBIOS chips on different hardware devices, and managing a collection of settings for hard drive/clocks." +
                                        "\nBIOS performs a power on self test to check if everything is working properly, then activates BIOS chips on" +
                                        "\n different cards installed in the computer, provides a set of low-level routines that operating systems use " +
                                        "\n to interface different hard drive devices like peripherals, finally it manages a collection of setting for " +
                                        "\nthe hard disks. From the very first second you turn on your computer, the BIOS does it’s thing, to test the " +
                                        "\namount of memory on your computer, and doing a lot of work to get your computer ready to run, like checking " +
                                        "\nif your turn on is a cold boot or reboot, by performing a read/write test then displaying information about " +
                                        "\nthe processor, hard drive, memory, BIOS revision/date and display. \n \n ");

                            } else if (choice == 5) {//CD-Burner
                                System.out.println("CD burners, used to pave the way for external writable CD drives, allow us to create unique CDs by" +
                                        "\n taking music/data files from local computers and engraving that information onto the CDs through a series " +
                                        "\n of bumps/flat areas, and for this stabilzing their position as standard equipment in PCs. Having their " +
                                        "\ninformation read by a laser beam on the CD-Burner, information on the CD is read byrelections " +
                                        "\nfrom the bumps and flats, on the other hand burners use write lasers to darken areas on CD-R discs and create " +
                                        "\ndigital patters that can be read by CD players. Having also moving laser assemblies, that interface with disc’s" +
                                        "\n surface to record data, and making photosensitive dye laters on CD-r run opaque when heated, CD burners are able" +
                                        "\n to record data with faster speeds needing advanced laser control systems and compatible discs. CD-RW differing " +
                                        "\nfrom CD-R discs both in price and usability, are different as they can be re written, as they have a compound " +
                                        "\nthat can change between crystalline and amorphous state when heated/cooled, having a laser melt compound and " +
                                        "\ncreating non-reflective areas representing 0s in the digital code, with erase laser on CD-RW heating the " +
                                        "\ncompound back to it’s crystallisation point and restoring " +
                                        "\nthe disc for re-recording. \n");

                            } else if (choice == 6) { //Tech related example
                                System.out.println("\nTaking news headlines by stream, artificial intelligence seems to be everywhere, with the powers " +
                                        "\nand possible limitations of these tools seeming to be growing everyday, from generating text to generating " +
                                        "\nimages. How does AI work? Designed to produce text photos or output, based on previous interactions, AI is " +
                                        "\nuses a technique called machine learning, through exposing it to loads of data to allow it to train while " +
                                        "\nhoping it eventually learns to mimic. A technique used by the developers of ChatGPT when they exposed it " +
                                        "\nto the seemingly endless quality of information on the internet, and scripts of dialog so it eventually " +
                                        "\ncan imitate conversation, it is scary how advanced tech seems to be. How has it been used? Yet very " +
                                        "\nuseful in the right hands, AI are currently being used in industries such as finance, automatic driving, " +
                                        "\nhealthcare, and used even by students to help them understand homework, currently challenging search " +
                                        "\nengines such as Google and Yahoo!. Dangers of Artificial Intelligence However very useful the innovation" +
                                        "\n and evolution of AI serves to be a double headed sword, carriny massive potential dangers, such as " +
                                        "\nconstituting potential invasions of privacies, serving to job loss as the automation of skills and " +
                                        "\nefficiency of AI when perfected is unmatched by humans, creation of misinformation, market and finaicial " +
                                        "\nviolation and potential singularity that may surpass human intelligence. Some well known AI tools include" +
                                        "\n ChatGPT, Stable Diffusion, and DALL-E, all systems used to produce things and grow from each individual interaction. " +
                                        "\nSo powerful and strong already, it’s hard to tell how impactful these AI tools will be in the future. \n");

                            } //Information Hub
                        } while (choice != 7);

                    }
                    else if (choice == 2) {
                        do {
                            System.out.println("\n\n********************************************************");//Quiz hub
                            System.out.println("*                      QUIZ HUB                        *");
                            System.out.println("********************************************************");
                            System.out.println("*                  1. Computer Memory                  *");
                            System.out.println("*                  2. Hard Drive                       *");
                            System.out.println("*                  3. CDs                              *");
                            System.out.println("*                  4. BIOS                             *");
                            System.out.println("*                  5. CD-Burners                       *");
                            System.out.println("*                  6. Rise of AI                       *");
                            System.out.println("*                  7. Solutions                        *");
                            System.out.println("*                  8. Exit                             *");
                            System.out.println("****************************************************");

                            System.out.print("What would you like to do? ");
                            choice = input.nextInt();

                            if (choice == 1) { //Computer Memory Multiple choice Question 1
                                System.out.println("\n \nQUESTION 1: What are the two main types of computer memory?");
                                System.out.println("\t 1) Read-only memory (ROM) and cache ");
                                System.out.println("\t 2) Temporary storage areas and permanent storage areas ");
                                System.out.println("\t 3) Random access memory (RAM) and hard drive");
                                System.out.println("\t 4) Registers and network storage\n");

                                System.out.print("What would you like to choose? ");
                                choice = input.nextInt();

                                if (choice == 1) {
                                    System.out.println("\n The correct answer was 2 :(");
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                } else if (choice == 2) {
                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                } else if (choice == 3) {
                                    System.out.println("\n The correct answer was 2:(");
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                } else if (choice == 4) {
                                    System.out.println("\n The correct answer was 2 :(");
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                }

                                System.out.println("QUESTION 2: How long does the CPU use memory in a computer?");
                                System.out.println("\t 1) Only during startup ");
                                System.out.println("\t 2) Only when files are being saved");
                                System.out.println("\t 3) From the moment the computer is turned on until it is turned off ");
                                System.out.println("\t 4) Only when the computer is connected to the internet\n");

                                System.out.print("What would you like to choose? ");
                                choice = input.nextInt();

                                if (choice == 1) {
                                    System.out.print("\n The correct answer was 2 :(");
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));


                                } else if (choice == 2) {
                                    congratulationPhrase = (int) (Math.random() * 3) + 1;

                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                } else if (choice == 3) {
                                    System.out.println("\n The correct answer was 2 :(");
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                } else if (choice == 4) {
                                    System.out.println("\n The correct answer was 2 :(");
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                }


                            } else if (choice == 2) { //Hard drive Question
                                System.out.println("QUESTION 1: What is the main purpose of a hard drive in a computer"); //Hard Drive Question #1
                                System.out.println("\t 1) To store data in a permanent form");
                                System.out.println("\t 2) To perform calculations and processing");
                                System.out.println("\t 3) To connect external devices to the computer");
                                System.out.println("\t 4) To display images and videos on the screen \n");

                                System.out.print("What would you like to choose? ");
                                choice = input.nextInt();

                                if (choice == 1) {

                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }
                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                } else {
                                    System.out.println("The right answer was 1 :(");
                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                }

                                System.out.println("QUESTION 2: What determines the performance of a hard drive?"); //Hard Drive Question #2
                                System.out.println("\t 1) Data capacity and physical size");
                                System.out.println("\t 2) Arm speed and hub size");
                                System.out.println("\t 3) Sector layout and track density");
                                System.out.println("\t 4) Data rate and seek time \n");

                                System.out.print("What would you like to choose? ");
                                choice = input.nextInt();

                                if (choice == 4) {
                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }
                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                } else {
                                    System.out.print("\n The correct answer was 4 :(");

                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                }
                            } else if (choice == 3) { //CD Question
                                System.out.println("QUESTION 1: How does a CD protect damaged packets of bytes from being misread? "); //CD Question 1
                                System.out.println("\t 1) By using interleaving");
                                System.out.println("\t 2) By adjusting spindle motor speed");
                                System.out.println("\t 3) By encoding data in spiral tracks");
                                System.out.println("\t 4) By using reflective aluminum layer \n");

                                System.out.print("What would you like to choose? ");
                                choice = input.nextInt();

                                if (choice == 1) {

                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                } else {
                                    System.out.print("\n The correct answer was 1 :(");
                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                }


                                System.out.println("QUESTION 2: Why does the spindle motor slow down as the laser moves outward on a CD? "); //CD Question #2
                                System.out.println("\t 1) To protect the CD from scratches ");
                                System.out.println("\t 2) To read smaller bumps");
                                System.out.println("\t 3) To improve laser focus");
                                System.out.println("\t 4) To maintain a constant data rate  \n");

                                System.out.print("What would you like to choose? ");
                                choice = input.nextInt();

                                if (choice == 4) {
                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                } else {
                                    System.out.print("\n The correct answer was 1 :(");
                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                }


                            } else if (choice == 4) { //BIOS Question
                                System.out.println("QUESTION 1: What does the BIOS do during the boot process of a computer? "); //BIOS Question #1
                                System.out.println("\t 1) Tests memory and checks for read/write errors ");
                                System.out.println("\t 2) Checks if it's a cold boot or reboot ");
                                System.out.println("\t 3) Displays information about hardware components ");
                                System.out.println("\t 4) ALl of the above \n");

                                System.out.print("What would you like to choose? ");
                                choice = input.nextInt();

                                if (choice == 4) {

                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                } else {
                                    System.out.print("\n The correct answer was 4 :(");
                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                }

                                System.out.println("QUESTION 2: How does the BIOS store changes made to the computer's settings?"); //BIOS #2
                                System.out.println("\t 1) Using CMOS technology");
                                System.out.println("\t 2) Through firmware updates");
                                System.out.println("\t 3) By saving data to the hard drive");
                                System.out.println("\t 4) By creating a separate partition for settings \n");

                                System.out.print("What would you like to choose? ");
                                choice = input.nextInt();

                                if (choice == 1) {

                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                } else {
                                    System.out.print("\n The correct answer was 4 :(");
                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                }

                            } else if (choice == 5) {//CD-Burner questions
                                System.out.println("QUESTION 1: Which type of CD can be erased and re-recorded?");
                                System.out.println("1) CD-R");
                                System.out.println("2) CD-RW");
                                System.out.println("3) CD-ROM");
                                System.out.println("4) CD-Audio");
                                System.out.print("What would you like to choose?");
                                choice = input.nextInt();
                                if (choice == 2) {

                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                } else {
                                    System.out.println("The correct answer was 2 :(");
                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                }

                                System.out.println("QUESTION 2: What happens when a write laser interacts with a CD-R disc?");
                                System.out.println("1) The reflective layer turns smooth");
                                System.out.println("2) The photosensitive dye layer turns opaque ");
                                System.out.println("3) The bumps and flats on the disc become detectable");
                                System.out.println("4) The digital pattern on the disc is erased");
                                System.out.print("What would you like to choose?");
                                choice = input.nextInt();

                                if (choice == 2) {

                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                } else {
                                    System.out.println("The correct answer was 2 :(");
                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                }

                            } else if (choice == 6) { //AI Questions
                                System.out.println("QUESTION 1: What is the primary learning method for AI  to generate text and photos?"); //
                                System.out.println("1) By mimicking human conversation");
                                System.out.println("2) Through direct programming by programmers");
                                System.out.println("3) By analyzing headlines and news articles");
                                System.out.println("4) Through exposure to vast amounts of data ");
                                System.out.print("What would you like to choose?");
                                choice = input.nextInt();
                                if (choice == 4) {

                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                } else {
                                    System.out.println("QUESTION 2: The correct answer was 4 :(");
                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));
                                }

                                System.out.println("QUESTION 1: What is one potential danger associated  with Artificial Intelligence");
                                System.out.println("1) Increased job opportunities for humans");
                                System.out.println("2) Enhanced privacy protection ");
                                System.out.println("3) Creation of misinformation");
                                System.out.println("4) Accelerated human intelligence");
                                System.out.print("What would you like to choose?");
                                choice = input.nextInt();

                                if (choice == 3) {

                                    congratulationPhrase = (int) (Math.random() * 3) + 1;
                                    switch (congratulationPhrase) {
                                        case 1 -> System.out.println("RICCI CERTIFIED !!");
                                        case 2 -> System.out.println("EXCELLENT :)");
                                        case 3 -> System.out.println("GOOD JOB :)");
                                    }

                                    points += CORRECT_ANSWER;
                                    System.out.println("----> You currently have: " + points + (" points\n"));


                                } else {
                                    System.out.println("QUESTION The correct answer was 2 :(");
                                    wrongAnswerPhrase = (int) (Math.random() * 3) + 1;
                                    switch (wrongAnswerPhrase) {
                                        case 1 -> System.out.println("TRY AGAIN NEXT TIME");
                                        case 2 -> System.out.println("GET GOOD");
                                        case 3 -> System.out.println("DO BETTER");
                                    }
                                    points += PITY_POINTS;
                                    System.out.println("----> You currently have: " + points + (" points\n"));

                                }

                            } else if (choice == 7) {
                                System.out.println("\n\n****************************************************");
                                System.out.println("*                    Solutions                     *");
                                System.out.println("****************************************************");
                                System.out.println("*              Comp. Memory 1 - 2                  *");
                                System.out.println("*              Comp. Memory 2 - 3                  *");
                                System.out.println("*              Hard Disk    1 - 1                  *");
                                System.out.println("*              Hard Disk    2 - 4                  *");
                                System.out.println("*              CD           1 - 1                  *");
                                System.out.println("*              CD           2 - 1                  *");
                                System.out.println("*              BIOS         1 - 4                  *");
                                System.out.println("*              BIOS         2 - 1                  *");
                                System.out.println("*              CD Burner    1 - 2                  *");
                                System.out.println("*              CD Burner    1 - 2                  *");
                                System.out.println("*              Rise of AI   1 - 2                  *");
                                System.out.println("*              Rise of AI   2 - 3                  *");
                                System.out.println("****************************************************");
                            }
                        } while (choice != 8);

                    }
                    else if (choice ==3) {
                        do {
                            System.out.println("\n\nCURRENT BALANCE: " + points + " points\n\n"); //SHOP menu
                            System.out.println("****************************************************");
                            System.out.format("%-4s %-30s %-10s %-15s", " # ", "Item", "Price", "Inventory"); //creates table for the shop interphase
                            System.out.format("\n%-4s %-30s %-10s %-15s", "1.)", "Justin Holl", "$1", +hollJersey);
                            System.out.format("\n%-4s %-30s %-10s %-15s", "2.)", "Vig Burger", "$1000", +vigBurger);
                            System.out.format("\n%-4s %-30s %-10s %-15s", "3.)", "Caprara's Signed Jersey", "$2500", +caprara);
                            System.out.format("\n%-4s %-30s %-10s %-15s", "4.)", "Cure to Chaminitus", "$5000", +cureCham);
                            System.out.format("\n%-4s %-30s %-10s %-15s", "5.)", "2023 Ford Mustang", "$10000", +fordMustang);
                            System.out.format("\n%-4s %-30s %-10s %-15s", "6.)", "Maple leafs to win stanly cup", "$100000", +stanleyCup);

                            System.out.println("\n7.)  Exit");
                            System.out.println("\n\n NEED MORE POINTS? PRESS 8 TO BET ON A COIN FLIP");
                            System.out.println("****************************************************");
                            System.out.println("\nWhat would you want to buy? (1-6) or do (7-8): ");
                            choice = input.nextInt();
                            if (choice == 1) {
                                if (points >= 1) {
                                    System.out.println("All that hard work just for a Justin Holl Jersey, what a waste of time"); //Holl jersey when bought
                                    System.out.println
                                            ("                                         :JJ?77777777777777777^                                     \n" +
                                                    "                                    .7!^::::^^^^~~~^^^:::.:::^~!!~:                                 \n" +
                                                    "                                 .~YB##BGPYJ?????77??JJYY5PPGGBB##BP?~.                             \n" +
                                                    "                             .^75B###BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB##B5?~.                         \n" +
                                                    "                          :!YG###BBBBBBGGGGGGGGGGGGGGGGGGGGGGGGGGGGBBBB###B5?^                      \n" +
                                                    "                       .7PB##BBBBBBBGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGBBB##G?.                   \n" +
                                                    "                     .JB##BBBBGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGBB#G~                  \n" +
                                                    "                    .5#BBBBGGGGGGGGGGGGGGGGGGGGGGGBBBBBBBBGGGGGGGGGBGGGGGGGGGGGB##:                 \n" +
                                                    "                    5#BBBBBBBBGGGGGGGGBBGBGBBBBBBBBBBBBBBBBBGBBBBBBBBBGGGGGGGGGGBBY                 \n" +
                                                    "                   7#BBBBBBBBBBBBBBBBBGGGGGGPGBGGBBGBBBBBBBBBBBBBBBB#BGGBBGGGGGGGGB^                \n" +
                                                    "                  :B#BBBBBBBBBBBBBBBBBY!5~5!7~Y!YB5~GBBBBBBBBBBBBBB##BBGBBBBGGBGGBBJ                \n" +
                                                    "                  YB#BBBB###BBBBBBBBBBJ^?~Y^G~J~YBY^GBBBBBBBBBBBBBB###BBBB&GGGBBGBBP                \n" +
                                                    "                 ~BGBBBBB###BBBBBBBBBBJ~?~J~G^J^5#J~BBBBBBBBBBBBBB####BBB#&GGGBBGBBG:               \n" +
                                                    "                 7GBBBB#####BBBBBBBBB#Y75!5!7!P!7??~?YBBBBBBBBBBB######BB&#GBGBGGGYJ:               \n" +
                                                    "                ::5BBGB#####BBBBBBBBBBBGBBBBBB#BBBBBBBBBBBBBBBBB#######BB&#BBGBBB?.^:               \n" +
                                                    "                ^!BBBBB#####BBBBBBBBBBBBBBBBBBBBB######BBBBBBBGB#######BB&##BBGBBY?PJ               \n" +
                                                    "               .~GBBBBB#####BBBBBBBBBBBBP!~!!!!!!7P####BBBBBBBGB#######BB&&#BBBGBB#Y:               \n" +
                                                    "               :7BBBBBB#####BBBBBBBBBBG?::^~~~~~~~^?G##BBBBBBBGB#######BB&&#BBBGGBGYY:              \n" +
                                                    "              .?GBBBBBB#####BBBBBBBBBB?.:^^~???!~~~^~B#BBBBBBBGBB#&&&##BB&&&#BBGGBP^:.              \n" +
                                                    "              ~#BBBBBBB#&###BBBBBBBBBB?:^^~P###G~~~^~B#BBBBBBBGGB##&&##BB&@&BBBGGBBGY^              \n" +
                                                    "              Y#BBBBBB#&@&##BBBBBBBBBBGGGGGB###B!~~^~B#BBBBBBBGGB##&###BB@@&#BGGGGBBB!              \n" +
                                                    "              !JY55PGBB#&&B#BBBBBBBBBBBBB######B~~^^~B#BBBBBBBGGB##&###BB@@@#GGGGGBBB?              \n" +
                                                    "              ^....:^~~!7?G#BBBBBBBBBBBBB#BPPPPJ~~^^~B##BBBBBBGGBB#&###BB@@@#BBBBBBBBJ              \n" +
                                                    "             .PGP55555555GBBBBBBBBBBBBBBB#G~~~~~!~^7P##BBBBBBBGGBB#&&#BBB#BP5YYJJ?7!^.              \n" +
                                                    "             :BBBB##&&&&&&#BBBBBBBBBBBBBB#G~~~~!!~^JB##BBBBBBBGGGB#&&#BBG57~:.......:!.             \n" +
                                                    "             :BBBBB###&&&&#BBBBBBBBBBBBBB#BPPPPJ~^^:!##BBBBBBBGGGB#&&#BGB##BPPP55PPGGB^             \n" +
                                                    "             :GBBB###&&&&&&BBBBBBBBBBB#########B~^^^~B#BBBBBBBGGGBB###BGB@@&&#BBBGGGGG~             \n" +
                                                    "             .^~!7???JJJJJYGBBBGBBBBBBG5PPGB###B~^^^~B#BBBBBBBGGGGB###BG#@@&#BBBGGGGBB^             \n" +
                                                    "              ?!^^^^~!7?JYG#GBBGBBBBB#Y:^~~5###P~^^^~##BBBBBBBGGGGB###BGB&&###BBBBGGPJ.             \n" +
                                                    "              P#BGBBB#&&&&@&BBBBBBBBBBP^^~~!777!^^^:~##BBBBBBBGGGGB###BGYJ?7!!~~~^:...              \n" +
                                                    "              P#BB#####&&&&@BBGBBBBBBB#G7~~~~~~~^^^7G##BBBBBBBGGGGBB##BGBBPJ7!~~~~7?Y!              \n" +
                                                    "              PBGGB&###&&&@@#BGBBBBBBBB##PJJJ???77P####BBBBBBBGGGGGB#BBG#@@&#BB#BBBBB^              \n" +
                                                    "              PBGGG#&&#&&&@@#BGBBBBBBBB#########BBBB###BBBBBBBBGGGGBBBBG&@&#BBB#BGGB5               \n" +
                                                    "              5BBGGB#&&&&&&&#BGBBBBBBBB########BBBBBB##BBBBBBBBGGGGGBBBG&@&BBB##GGBB!               \n" +
                                                    "              YBBGBBB&&&&&&&&BBBBBBBBB#########BBBBBB##BBBBBBBBGGGGGGBBG&&#B#&&BGBBG:               \n" +
                                                    "              7#BBBBB#&&&&#&#PB##BB#######&&######B#####BBBBBBBGGBBBBBBG&###&&#BGBB5                \n" +
                                                    "              ~BBBBB###&&&&@G~JJYYYYJJJJJJJJ?????JYPGGGBGBBBBBGP55Y?7!~?##&&&#BBBB#!                \n" +
                                                    "              :BBBBB####&&&@5 .....:::::^^^^^::::::::^^^^^^~^^::..  .. 7&&@&&#BBBBG.                \n" +
                                                    "               PBBBBB###&&@@5 ......::::^^^^^:::.::::::::........      ?@@&&###BB#J                 \n" +
                                                    "               J#BBBB####&@@Y~777???JJYY5PPPPP55Y?!~~^^::::::::^^~~7???B@@&&&&#BB#~                 \n" +
                                                    "               ^BBBBB####&@@PYBBBB######&&&&&#####BBBBGGPPPPGGBBBGBBBBB@@@&&&&BB#P                  \n" +
                                                    "                P######&&@@@P5BBBBBBBB##&&######BBBB###BBBBBBBBBBGPGBGB@@&&&&&BBB~                  \n" +
                                                    "                :J5PGBBGPY7^.5BBBBBBBB##&&&#####BBBBB#BBGBBGGGBBBGPGGB55&@@@@&##G.                  \n" +
                                                    "                    ...      YBBBBBBB###&&&#####BBBB##BBBBBBBBGBBBBGPJ: :!JPGPPY~                   \n" +
                                                    "                             !B########&&&&&####BBBB##BBBBBBBBBBBGY!.                               \n" +
                                                    "                              ^7?JY55PGBB########BBB###BBBBBGPY7~.                                  \n" +
                                                    "                                       ...::^^~!7?J5PP5YJ?!~:                                       ");

                                    hollJersey += 1; //increases amount in inventory
                                    points -= 1;

                                } else {
                                    System.out.println("YOU CAN'T AFFORD BROKIE"); //taunting the poor
                                    pointsRequired = 1 - points;
                                    System.out.println("You need to get  " + pointsRequired + " more points to afford");

                                }

                            } else if (choice == 2) {
                                if (points >= 1000) { //buy vig burger
                                    System.out.println("Vig burger, good choice ");
                                    System.out.println("                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                .....                                               \n" +
                                            "                                       .:^~!!?JYYYYYYYJJ?7!^.                                       \n" +
                                            "                                   .^~7?JY5PPPPPPGGPPPPPGPPP5J7^.                                   \n" +
                                            "                                .^!??JY5PPPGGPPPPPPGGGPPPPPPPPP5Y7:                                 \n" +
                                            "                              .~7??JJY5PPPPPPPPPGGGGGGGGPPPPPP555YJ7:                               \n" +
                                            "                             ^7???JYY55PPPPPPPGGGBBGGGGGPPP5PP555YYJJ!.                             \n" +
                                            "                           .!??7??JYY5P5PPPPPPGGGGGGGGGGPP5PP555YYYJJJ!.                            \n" +
                                            "                          .7?????JJYYY555PPPPGGGGGGGGGGGGPP55555YYJJ???!                            \n" +
                                            "                          ~??????JJYYYY5PPPPPPPGGGGGGGGPPP55555YYYJJJ???~                           \n" +
                                            "                          7?????JJJJYYY5PPPPPPGGGGGGGGPPP555555YYJJJ????7:                          \n" +
                                            "                         .?J?JJJJJYYYYY5555PPPPPPPPPPPPP5555YYYYYJJ???7??!.                         \n" +
                                            "                    ^!!!~~77??JJJJYYYY55555PPPPPPPPPPPPPPP5555YYYJ??77777!!!!777                    \n" +
                                            "                   :J???777!!!!!7777777?????JJ???J???JJJJJ??????77777!77777?J?~:                    \n" +
                                            "                    ^!?JJJ?!~!???7!~!7???!!J777~!!!!~~^^~~!77777!!?7!~!77?JJ!.                      \n" +
                                            "                     ~??7!~^~?7~^~~~~~7!!!~!!!~^^^^^^^~!?7J?!~^^~~~~~~~~~: .                        \n" +
                                            "                     .~?JJ!~~~~~^^~~~!!!!7!^^^^~~~^^^^^~!!~~^~~!7??7!!!7?!:.                        \n" +
                                            "                      JPPPPP55YYYYYY55PPPPPP5YJ?77!!!!!!!!!!!77!?Y55PPPGGBGP!                       \n" +
                                            "                      .^?YYYY55PPPGGGGGGP55YYY?!7?77?7?J???YJ7!!JY5PPGGGGPPP~                       \n" +
                                            "                    .~?J7~^^:^~!?YY55555555555YJ?!^^^::^^::^^^^~~!77?JY5PPPPJ^                      \n" +
                                            "                   .?J7!^:^^^^^^^~!?YPP5555YJ?7!~^::::^^::^:::^:^:^^^^^~!?J5PG7                     \n" +
                                            "                       :^^~!~~~!~^:^~7JYJ7!~^~^~~^~^~~~~~!JY?~^~~!!!~~^:::^!!77                     \n" +
                                            "                        :^^:^::^^^::::^^::^^^~^~~^^~~~~~^^~!~^^::^^:::::^^^                         \n" +
                                            "                         ^?7?7777!!!~^^~~~^^^^^^^~^::::^^^:^^~!!!!!77?????^                         \n" +
                                            "                         ~JYYYYYY555P55PP5P555PPPGPYYYYYYYYYYY555YYYJJJ???:                         \n" +
                                            "                         :7?JYYYYYY55555PP55PPPPPPPGGGGPPPP5555YYYYYJJJJ?!                          \n" +
                                            "                           .:^^~!7JJY55PPPPPPPPGGGGGGBBGPPPPPP5YYY??77!~^.                          \n" +
                                            "                                   ..::^~~!!!77777????7!!!~~^::... .                                \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    ");
                                    vigBurger += 1;
                                    points -= 1000;
                                } else {
                                    System.out.println("YOU CAN'T AFFORD BROKIE");
                                    pointsRequired = 1000 - points;
                                    System.out.println("You need to get  " + pointsRequired + " more points  to afford");

                                }

                            } else if (choice == 3) {
                                if (points >= 2500) { //caprara jersey
                                    System.out.println("Students vs teachers MVP, Mr.Caprara");
                                    System.out.println("\n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                 :!!!7!!!~^:............:^~!!!7!!!:                                 \n" +
                                            "                                 ?@B5GJ7!JJJ??!~~~~~~!??JJ?!7JG5B@?                                 \n" +
                                            "                                 Y@P5PP?!!?JJJ?7!!!!7?JJJ?!!?PPPP@5                                 \n" +
                                            "                                :B@YPPPPJ7!7?JJJJJJJJJJ?7!7JPPPPY@B:                                \n" +
                                            "                                7@#YPPPPPY?!!7?JJJJJJ?7!!?YPPPPPY#@7                                \n" +
                                            "                               :G@5PPPPPPP5J7!!!7??7!!!7J5PPPPPPP5@G:                               \n" +
                                            "                              .J@BYPPPPPPPPP5Y?7!!!!7?Y5PPPPPPPPPYB@J.                              \n" +
                                            "                             .7&&YPPPPPPPPPPPPP5YJJY5PPPPPPPPPPPPPY&&7.                             \n" +
                                            "                             7#@5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5@#7                             \n" +
                                            "                            ?&&5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5&&?                            \n" +
                                            "                          :5@#5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5#@5:                          \n" +
                                            "                        :J&@G5PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP5G@&J.                        \n" +
                                            "                        ~@#JJPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPJJ#@~                        \n" +
                                            "                         7Y7JPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPJ7Y7                         \n" +
                                            "                         ^57JPPPPPPPPPPP5PBBBBBBBBBBBBBBBP5PPPPPPPPPPPPJ75^                         \n" +
                                            "                         :57?PPPPPPPPPPPYBY55YYYYYYYYYYJG@B5PPPPPPPPPPP?75:                         \n" +
                                            "                         .5??PPPPPPPPPPP5P7????JJJJJ?????Y&&P5PPPPPPPPP??5                          \n" +
                                            "                          ?J75PPPPPPPPPPYB&#########&Y??J75@B5PPPPPPPP57J?                          \n" +
                                            "                          ~Y7JPPPPPPPPPPP5PPPPPPPPYG#J???5@G5PPPPPPPPPJ7Y~                          \n" +
                                            "                          :Y7?PP5PPPPPPPPPPPPPPPP5GB????P@G5PPPPPPPPPP?7Y:                          \n" +
                                            "                           Y??PPYPPPPPPPPPPPPPPP5BG????G@P5PPPPPPPPPPP??Y                           \n" +
                                            "                           J?75GYPPPPPPPPPPPPPP5BP????B@P5PPPPPPPPPPP57?J                           \n" +
                                            "                           J?75G5YPPPPPPPPPPPP5#5?J??#&5PPPPPPPPPPPPP57?J                           \n" +
                                            "                           JJ75PPY5PPPPPPPPPP5#Y?J?J&&5PPPPPPPPPPPPPP57JJ                           \n" +
                                            "                           JJ75PP5JPPPPPPPPP5#Y?J?Y@#5PPPPPPPPPPPPPPP57JJ                           \n" +
                                            "                          .?775PPP5YPPPPPP5P#J?J?5@BYPPPPPPPPPPPPPPPP5777.                          \n" +
                                            "                          .7!!5PPPPYYPPPP5PB????P@B5PPPPPPPPPPPPPPPPG5!~!.                          \n" +
                                            "                         :!!!555PPPP5YPPP5@5YYYG@G5PPPPPPPPPPPPPPPPP5JJ!77:                         \n" +
                                            "                         ~?!YPPPPPPPP5Y5PPPGGGGGP5PPPPPPPPPPPPPPPPPYJ5P57?!                         \n" +
                                            "                         !??Y55PPPPPPPPYY5PPPPPPPPPPPPPPPPPPPPPP5YY5PPP5??!                         \n" +
                                            "                        ~Y??5PP555PPPPPPP5Y5PPPPPPPPPPPPPPPPP5YY5PPPPPP5??Y~                        \n" +
                                            "                       .Y???PPPPPPPPPPPPPPP55Y55PPPPPPPPPP5YY5PPPPPPPPPP???Y:                       \n" +
                                            "                        .!?PGPPPPPPPPPPPPPPPPPPPPPPPPPP5555PPPPPPPPPPPPGP?!.                        \n" +
                                            "                          :75PGPPPPP5555PPPPPPPPPPPPPPPPPPPPPPPPPPPPPGP57:                          \n" +
                                            "                             ^7YPGGGPPPP555555555555555555555555PGGPY7^                             \n" +
                                            "                                :~7J5PPGGGGPPPPPPPPPPPPPPPPPPPP5J7~:                                \n" +
                                            "                                    .:^~!7?JYY55555555YYJ??!~^:.                                    \n" +
                                            "                                                ...                                                 \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    ");
                                    caprara += 1;
                                    points -= 2500;

                                } else {
                                    System.out.println("YOU CAN'T AFFORD BROKIE");
                                    pointsRequired = 2500 - points;
                                    System.out.println("You need to get  " + pointsRequired + " more points  to afford");

                                }
                            } else if (choice == 4) {
                                if (points > 5000) { //cure to chaminitus
                                    System.out.println("Magic right there");
                                    System.out.println("\n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                    .::             \n" +
                                            "                                                                                  .^^.              \n" +
                                            "                                                                                .^^.                \n" +
                                            "                                                                              .^^.                  \n" +
                                            "                                                                            :^:.                    \n" +
                                            "                                                                          :^:                       \n" +
                                            "                                                                        .^:                         \n" +
                                            "                                                          :!^       ::!!.                           \n" +
                                            "                                                        :JB#B5~  :7JJY7                             \n" +
                                            "                                                      ^JBB5JPB#5YGB#57.                             \n" +
                                            "                                                    ^YBGJ7JJJJ5B##BY:                               \n" +
                                            "                                                  ~5BG??JJJJJJJJ5GBP7.                              \n" +
                                            "                                                !PBP?7JJJJJJJJJJJYPB#G?                             \n" +
                                            "                                             .!PB5J7JJJJJJJJJJJY555G#G?                             \n" +
                                            "                                           .7GB5J!7JJJJJJJJJJY55PGBP7.                              \n" +
                                            "                                         :?GG5J7JJJJJJJJJJY555PGBP!.                                \n" +
                                            "                                       :JBBPY?JJJJJJJJJJY555PBB5~                                   \n" +
                                            "                                     ^JBB5GPBGPJJJJJJJY555PBBY~                                     \n" +
                                            "                                   ^YB#Y5PBB##&#PYJJY555PBBY^                                       \n" +
                                            "                                 ~5BBYGG5B######&#GP55GBBJ:                                         \n" +
                                            "                               !5BBYGGBB########&&&#BBG?:                                           \n" +
                                            "                            .7PBBYGGBB########&&&&##G7.                                             \n" +
                                            "                    :77^  .7GBB5PBBB########&&&&##P7.                                               \n" +
                                            "                    .7PB5JG#BPJGBB########&&&&##P!.                                                 \n" +
                                            "                       !5BBBBBBB#######&&&&##B5~                                                    \n" +
                                            "                         ~YGGBBBB####&&&&##BY~                                                      \n" +
                                            "                          7BBGGBBBB#&&&##BY^                                                        \n" +
                                            "                       .?G#BBBBBBBBB###GJ:                                                          \n" +
                                            "                     :?G#BBB#BY~?GBBBG?:                                                            \n" +
                                            "                   :JB#BBB#BY^   :?PB5:                                                             \n" +
                                            "             ^~  ^YB#BBB#BJ:       .7PB~                                                            \n" +
                                            "            ^P#55B#BBB#G?:           .~.                                                            \n" +
                                            "             .!P##BBBP7.                                                                            \n" +
                                            "                !5B#5:                                                                              \n" +
                                            "                  ~5BJ                                                                              \n" +
                                            "                    :                                                                               \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    ");
                                    cureCham += 1;
                                    points -= 5000;

                                } else {
                                    System.out.println("YOU CAN'T AFFORD BROKIE");
                                    pointsRequired = 5000 - points;
                                    System.out.println("You need to get  " + pointsRequired + " more points to afford");

                                }
                            } else if (choice == 5) {
                                if (choice >= 10000) { //car
                                    System.out.println("Zroom Zroom Zroom car moves fast styll");
                                    System.out.println("                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                ....                                                \n" +
                                            "                           ...:^^~!!7??JJJYYYYYYY55YYYYYYYJJJ??7!!~^^:...                           \n" +
                                            "                   .:^~!?JY555P55YYJJ??7777!!!!!!!!!!!!!777???JJYY5555555YJ?!~^:.                   \n" +
                                            "             .:^!?Y5P55YJ?7!~^^^~!??JJJJJJ?7!!~^^^:::::::::::::^::^^^^^~!7?JY55P5Y?!^:.             \n" +
                                            "         .:!J5P5Y?7~^^^::^^^:!YBBPY?777??JJP&@BBBBBGGP55555PGB#P^^^^^^^^^^^::^^^~7?Y5P5J!:.         \n" +
                                            "      .:75P5J!^^::^^^^^^^^^^Y@@?^::~7:^::!5GY7~~!7JYPGB#####G5?~^^^^^^^^^^^::^^^^^::^^!J5P57:.      \n" +
                                            "    .^JBP?~^:^^^^^^^^^^^^^^~@@#7!?PB?::!G#J^JYG?:^:::^^^^^^^^::^^^^^^^^^^:^JYJ^^^^^^^^^:^~?PBJ^.    \n" +
                                            "   :~BB!::^^^^^^^^^^^^^^^^:^Y#@@&#P?!?5@&5?J#B5~:^^^^:::^^^::^^^^^^^^^^^:!#@B!^^^^^^^^^^^^::!BB~:   \n" +
                                            "  :^G&~:^^^^^^^^^^^^^^^:^!?!:^~!~JY?G@@J~~~!7P7^!^:^~?Y?^^!?7~^^:^!77~:^Y@@Y^^^^^^^^^^^^^^^^:^&G^:  \n" +
                                            "  :^G&^:^^^^^^^^^^^^^^^Y##5!^^^^:^!G@B!:^?G#B5!Y@5!GBP&@GB#@@5:!5##GP#5G@#7:^^^^^^^^^^^^^^^^:^&G^:  \n" +
                                            "   :~BB!:^^^^^^^^^^^^^P@#~::^^:^!P@@5^:~B@#7^::Y@@BJ^7&@@G~Y5YG@@Y~:^&@@P^:^^^^^^^^^^^^^^^^:!BB~:   \n" +
                                            "    .^JBP7^::^^^^^^^^^#@&?~^~!JG@@B7::!&@@!::^7&&Y^:Y@&J5&GPG&@@7::~P@&J:^JG7^^^^^^^^^^::^7PBJ^.    \n" +
                                            "      .:75P5J!^^::^^^^7#@@@&&@@&G7^:^5BP@@BY5B&P~:!B@B!:^~!~^G@@YJP#@@575G5~^^^^^^::^^!J5P57:.      \n" +
                                            "         .:!J5P5Y?7~^^:^7J555J7~^:^^^~^:!YGGPJ~:^^YPY^^^^^^^^~YGG5?~5BG5?^:::^^^~7?Y5P5J!:.         \n" +
                                            "             .:^!?Y5P55Y?7!~^^^^^::::::::::::::^^^:::^^^^^^^^::::::::^^^~!7JY55P5Y?!^:.             \n" +
                                            "                   .:^~7?JY5555555YYJJ??7777!!!!!!!!!!!!7777??JJYY5555555YJ?7~^:.                   \n" +
                                            "                           ...:^^~!77??JJJYYYYY555555YYYYYJJJ??77!~^^:...                           \n" +
                                            "                                               ......                                               \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    \n" +
                                            "                                                                                                    ");
                                    fordMustang += 1;
                                    points -= 10000;
                                } else {
                                    System.out.println("YOU CAN'T AFFORD BROKIE");
                                    pointsRequired = 10000 - points;
                                    System.out.println("You need to get  " + pointsRequired + " more points  to afford");

                                }


                            } else if (choice == 6) {
                                if (points >= 1000000) { //false hope, leafs with a cup pfttt
                                    System.out.println("Well you got scammed, thinking a game can help the leafs win a cup, not even God can do that.");
                                    System.out.println("\n" +
                                            "Result\n" +
                                            "                                                                                                    \n" +
                                            "                              ....:::^~!!!!!!7??JJJ??77777~^^^:::::..                               \n" +
                                            "                      .:^~!!!~~~!!77!!?JJYJJJYYY55PPP555555YYYJ77?77!~77!!~^^::.                    \n" +
                                            "                    ~77!7?????????JJ?JYYYYYY55PPPBBBBBBGBGPYYJJJJJJJ?JJJ77777!7!77~.                \n" +
                                            "                    !7???JJJJJ7!!!7?77?Y5YYYY55PGBGPP555YJJ?JJ777?J?7?JJ???J?!77JJJ:                \n" +
                                            "                    .???7?JJJJ!!!!77~~!JYJ555PY5GPYYY5Y5PPJ?JJ?77?777??J??7777??YY~                 \n" +
                                            "                     7J?7JJYY?!~!!7?7^^?5JJJJJ?Y5YYJJJY555YYJ77!!7!!J???77!!!7?JYY.                 \n" +
                                            "                     ?J?7JJJJJ7~~~!77?!!77JJ??7JJ55J5YY55YY5YJ?JJ7?JYJJJ7!?J!!?YJJ.                 \n" +
                                            "                     ~YJ?7JJJY5?^^^^~7?7??Y5Y?!?J??7Y?55P577?7!?7^7YYYYJ???J7?JJJ!                  \n" +
                                            "                     .????JJJYPP77?!7JPJ7!7J??~7J7?!???J5Y??YGY7!JP?JYY??J???JJJJ:                  \n" +
                                            "                      ~?JJJ7?JJ?J?J!J77?~^7???~77??7?7!7?77JYY77?577JJ?JJJJJ?J?J!                   \n" +
                                            "                      .7??77!?7!J77!J77!~!77?7~7!777!!!77~7?7~!??!~7J!7JJJJJJ???:                   \n" +
                                            "                       .!?~7~!7~~77!??J!7?J!!!JY!~7?!!77~!77~7?7!7?7!!!7!7?J???^                    \n" +
                                            "                         ~?7?~?~!77~7J!~?Y?~7PBY7YP5?JYJ?J?!77!!7777777!!77?J?^                     \n" +
                                            "                          :!77777?~!?7~7J!~YJ?7YP5Y5PP555YYJ?77!!777777777?J!.                      \n" +
                                            "                            .^!!!?!!7~?YJ7JY7J5YJ5YYY5P55555YJ77!!!7????J?!:                        \n" +
                                            "                               :^~!!!77?J????J?JJY55P5JJJ?JJJJJ?!!!7?J?7^.                          \n" +
                                            "                                  .^~!!777777!7?J5B#&GY???777?J?7!77~:.                             \n" +
                                            "                                      .~!77?77?JY5#&&GY??J?7??7~:.                                  \n" +
                                            "                                        :?7?77?JY5#&&GJ??J7!??.                                     \n" +
                                            "                                    .:~~?J?YJ?5YJPGGG55YJY??J?!~^:.                                 \n" +
                                            "                                  ~??JYJ5J?PJJGYJP5555G5JPYJP??J?J?!.                               \n" +
                                            "                                 :J7???77???JJYY5GGBBBGYJ????J??77?Y!                               \n" +
                                            "                                 ??!JY?!7J77YY55GB&@#@@GY?77!JYJ?!!?Y!                              \n" +
                                            "                                 ??!JY?77?!7JY55PB&&#@&PJ?!!!JJ??~!?YJ                              \n" +
                                            "                                 7?!JY?!!?~!YJ55GB&&#@#Y?7!!!JJ?7~!?Y?                              \n" +
                                            "                                .??!7J????77????JJ55PP5Y???J?????!7?Y?                              \n" +
                                            "                              :!??77777?????JJJYY55P555YJJJ???????77?J?~.                           \n" +
                                            "                              !J77YJ7~!!7!!JJYY5PG#&###PYJ777?7JJ?7!!7JY^                           \n" +
                                            "                              ~Y77YJ7!!!7!7JYYY5PG#&#&&#PY?777?JY?7777YY:                           \n" +
                                            "                              !J!?5J77!!7!7JY55Y5B####&BYJJ?7??JJ77777YY:                           \n" +
                                            "                              !Y~?YJ?777?!!JJYYY5G##B#&B5YJ????JJ?7!77JY:                           \n" +
                                            "                              ~??77??!!!777?JJJYY5B#B##PYJ???7???7!!7?7?^                           \n" +
                                            "                               7J7?JJ7!7??7?JJYY5PB#B##5J????7???7!!?JJ^                            \n" +
                                            "                            :~7J???JJJ???JJJJJYY5PBBGGG5JJJ?JJJJ?777?JYJ~:                          \n" +
                                            "                          .?YJ?JJJJ??JJJJYYY555PPB##BBBBP555YJJJJYJ?77??YYJ:                        \n" +
                                            "                          :YJ!?YYJ7!77?7!?YJYYY5PPGGPPGG5YYJ?77!7???7777?JY~                        \n" +
                                            "                          .JJ!?YYJ7!77?!7?YY5YPPGBBBBB##G5YJJ??77JJJ??77?JY~                        \n" +
                                            "                          .JJ!?Y5J777??!7?YY5YPGG#BBBB#BP55YJ????JJJ??77?YY~                        \n" +
                                            "                          :YJ!?YYJ777?J!7JYJYY5PGB&###&&G5YY???7?YYJ??77?YY!                        \n" +
                                            "                           ~JJ?77???????JYYJYYY5PG##B##B5YYYJJJYJYJ??7?JJJ7^                        \n" +
                                            "                        .:^^JJ?7JJJ?77????JJJYY55G&&B#&B5YJJ???JJJ?777?JYY7..                       \n" +
                                            "                       ^YY?JYYJJ???JJJJYYYYY5555PGBBBBBG5YYYYYYYYYJJ???JJJYYJ?:                     \n" +
                                            "                    ...?5J!JYYY?777??!7?YJY5Y5PPB#&#B#&&G5YYYJJJ??YYYJ??777?JY7                     \n" +
                                            "               .^!7?JYYYYJJJ????????????JJJYYY55PB#BGB#BPYYJJJJJ??JJJ????JJJYYYJ????7~.             \n" +
                                            "             ~JY5YYJJ?JJJJJJJJJJJJJJJJ?????JJJJYYY555P5YJJJJJJJYYJJJJJJJJJJJJ?JYYY5555Y?^           \n" +
                                            "            !5YJ??JYJJYYJ?JJJJJJJYYYYYY555555PPPPGGGGGGGGPP55555555555Y5YYYYJJ????JJYYY55!          \n" +
                                            "          .~YYJ??JYYYYJJ?7???JJJ??JYJYYY55555PPGB####B###BGPP55YYYJJJJJJY5JYYJJ??7?JJYY55Y~.        \n" +
                                            "          ~5J?!JYYYYJJ??????JJJJJJYYYYYYYY555PPGB###BBBBBBGG55555YYYYYJJJJJJJJJJ?JJJ?JJYYYY!        \n" +
                                            "          ~YJJ7YPP5YYJ7??77???7!7??JJJJYYY5PPGBB&&##BGBBBBBGPYYYJJ????7!7?YYJYJJJJJJJ??JYYY!        \n" +
                                            "          ~JJ?75PPPYYJ??????J?77??JYYJYYYYY555PGP55PPPP55P555YYJJ??77??7!7YJJJJJJJYYJJJJYYY!        \n" +
                                            "          ~JJ?75PP5YYJ?????JJJ?7??JYYYJYYYY55PPGGPPPPPPPPP55YYYJJJ???77!!7JYJYJJJJYYJJ?JYYY!        \n" +
                                            "          ~JJ??5GP5YYJ??????JJ77??JYYYJYYYY55PGGGGGGGGGGGGG5P5JJJJJ????!!7?YJJJJJJYYJJ?JYYY!        \n" +
                                            "          !?J?75GP5YY?7?7??JJ?77??JYYYY5YYY55PPBGGGGGGGGGGP555JJY??777?7!??YJJJJJJYYJJ?JYYY!        \n" +
                                            "          7JJ?75GP5YYJ7????JJ?77??YYYJY5YYYY5PGBG55PPPPPPPP555YJJ??77?7!~7?YJJJJJJYYJJ?JYJJ7        \n" +
                                            "          7JJ?7YPP5YYJ777??JJ7!7J?JYYJY5Y55Y55PGPPP55PP55YY5YJJ??????77!~7?Y?JJJ?JYYJJJYYJJ7        \n" +
                                            "          7JJ?!YPP5YJ?!7777JJ7!!?JYYYJYYYYY55PGB#BBGPPGGGPPP5YYJJJ???7J7!!J5?JJJ??Y5YJJJJYY?.       \n" +
                                            "          7JJ7!?JJJJ??7777??J???JY5YYJY5YYY5PPPGBBBBBGGBBBGP5YJYYJJ?JJYJ??JY?????7???77J5JJ?        \n" +
                                            "          7JY77JJYYYY?!!!~!7??777?JJ?JJJJJJJYYYY55YJJJJJYYYJ?JJJ??7?777777?JJJJJ?JJ?777J5JJ7        \n" +
                                            "          7JY?7YY555Y?7!!!77?J?77JYYJYYYYYY555PPG5YY5PPP555YYYJJJJ?7!??77?JYYYYYYYYYJ??J5JJ7        \n" +
                                            "          ?JY775YY5YYJ77777??J???JJJJJYJJYYY55PGGP5PPPPPGGP5YYYYYJ?77??????YYYYYYJJJJ??J5JJ7        \n" +
                                            "         .?Y5?~Y5Y5YY?7777???J???JJJJJJJYYYY555GG5555555PPP5YYYYJJJ?7?J???JYYYYYYJJJJ??JYJJ7        \n" +
                                            "         .JY5J!YYYYYYJ77777???????JJJJJYYYY555PPPP5555555P5YYYYJJJJ?7??????JYYYYYJJJJ??JYJJ!        \n" +
                                            "         .JY5J!5YJYYY?77!77???777??JJJYYYYYY5PPPP555555Y55YYYYJJJJJJ7?????7JJYYJJJJJ??7JYJJ!        \n" +
                                            "         .J5GJ~55YYYY?777!!7??7777?JJJJJJYYY5PPP5P55555555YYYYJJJJ??7????7?YJJJJJJJJ7!7J5??!        \n" +
                                            "         :YY5?7PPPP55Y7!~~!7?7!!777JJJYYYJY5PPGGP55YYYYY5YYYJJJJJ????777!!7YJYYYYJY?!!7J5YYJ:       \n" +
                                            "         .J5P?7JYYYJJ??7777??77777?JJJJYYYY55PPGGPP55555PP5YYYYYJJJJJJJ???JYJJJ?????777?YJJ!        \n" +
                                            "         .J5G~7YYGGPPJ!!!!!!??!!!!?JJ??JJJJJJYYY55YYYY55P5YJJJJ???????7777?YJYYJJJ?^^~7Y5JJ!        \n" +
                                            "         .J5G!?5YPPP5J7!!!77?J?777JYYYYYYYY5Y5PPP555555555YJJJ??J?7!!777???YY5YYJJ7^^77J5YJ!        \n" +
                                            "         .J5P77JY5PP5J??!77?JJJ?7?JYYYYYYYY555PP55YYYY55YYYJJ??JJJ?77?J?J??JY5YYJJ7!~77J5YJ7        \n" +
                                            "         .JPG77JY5PP5?77777?YYJ???JYYYYY55YYY5PP55YYY55555YYJJJJJJ?777?????JYYYYYJ?!~??J55J?        \n" +
                                            "         :Y55!?YYY5PYJ??777?YJJ?7?YYYYY5Y55555PPP5YYYYYYYYYYJJJJJJ???7???7?JYYYYJJ?7!7?J55Y?.       \n" +
                                            "         :Y5J~JYYYY5YJ???7?JYYJ77?JYYJY55555PPPPP5YY555YYYJJJJJJJ?????JJ???YYYYYYYJ7!??J55YJ.       \n" +
                                            "         7Y57^?JJJJJYJ??77?JYYJ???JYYJY555555PPP5555YYY5Y5YYJJJYYJJJ?JJJJ??YYJYJJJ7!!??J555Y~       \n" +
                                            "         !55Y7JJYYJ?777!!!!JYJ?7??YYJJJY555555PPPYYYYYY555JYJJJJJJJ?77??77J5??JJJ?7!77?YPPP5~       \n" +
                                            "         :YPJ!?JYYYYYJ???7?JY?777?YJJ??JJYYY55P5P555YJ5PPPYYJJJYYJJ77?7777YPJYYYJJJJJ??J5P5J^       \n" +
                                            "         :5P?~7JYPP5J?!!77??JJ??JJYYYYYYYY5555PPGGGGPPPGGGPP55Y55YYYYYYYJJYYYYYJJ7!?777JPPPY^       \n" +
                                            "         ^55J??JY5PYJ7!~!7??JJ7!7JYYYJ?YYYY5Y55PPP55555P55YYYJ??J???????77JPYYYJ?!?J?J?J5PGY^       \n" +
                                            "         ^55J77?YYJJJJ777?JJYY?7?YY5Y??J5YY555PPPP555555YYJJYJJJYYYJJ?????5PYYYJJ???????5PG5^       \n" +
                                            "         ^55?!!?JJ???!!!!?JJYY?77JYYJJJYYY5YY5555555YY55YYYYJ?JJJYYYYJ?JJJ5PJYYYY??J????Y5GP^       \n" +
                                            "         ^5YJ77JYJJ?7!!!!7JJJJ?7?YYYJ??J5Y55555YYYYJYYY55YYYJ?JJYYYYYYJJ?J5PJJJJJ?JJ????J5PG^       \n" +
                                            "         ~5YJ77JYJJ???7!!??JJJ777JYJ???7Y555555YYYYYYY555YYYJ?JYJYYYYYYJ?J5GJJYYY77??77?J5PG!       \n" +
                                            "         7PYJ!7JJJ??7??77?JJYJ777JYYJJJJYY555Y5YYYYYYY55YYYJJJJYYYYYYYYJJ?JP5YY5Y77??777?5PP?       \n" +
                                            "         ^PY?!7YJ?7!!!!~7??JYY???JYYYJ?J5555YYYYYYYYYYY555YYYJYYYYYYJYYJJJJ5PYJJJ??J???JY5PP^       \n" +
                                            "         ^P5P~7JJJJJ?????JJYYYJJ?JYYJJ?J5YYYYYYJYYYYYJYY5555YJJJJYJYYYYJYYY5G5YYYJ?77!!~~JPP^       \n" +
                                            "         ^PPP7?JJJ77!!~!7!7???????JJJYYY55555PPPGGGGGPPGGGGPP55YYYYYJJJJJ????7!!~~~^^^~^~YPP^       \n" +
                                            "         ^YPP?JYYJJ?7!~~!7!777!777?777??JJJJYJJJY5555YY5PP5Y5J??JJJY7777?7777!~!!!~~~^^^~YPY:       \n" +
                                            "         :7P57?JJJ??7!7~7J?J?J??JJ5J?JJYJJJY5555555PP55PPP555YYYJJJ5?77???7?7!!!!!~~~^^^~YP7.       \n" +
                                            "         ^!??7???J??!~~~7?J?J?J?JJYYJJJYJJJYY55555555555555555YYYJJY?7???77?7!!!!!~^^^^~~YJ^:       \n" +
                                            "     .::^^!~!7??????7!~~7J?JJJ???JYYYYYYYYJY5555Y555Y555P5555YYYYJJJ??7777??7!!~~~~~~^^!~?~^~~^:    \n" +
                                            "    .^^^^7~~!77???????7!7J???J????JJJJJJJJJY55555555555PPPP55555YJJYJ?77????7!!!~~~~^^^!~~~~?!~~~.  \n" +
                                            "    ^^^^^?Y?!!!!77???J?77JJ?JJ????JJJJJJYYJY5555Y555555PPPPP55P5YJJYJ?????777!!!!!~~~~!~!?Y5?~!!!^  \n" +
                                            "    ::^^^~!77?JY??77!~!!7??????J???JJJJJYYJY5555Y5555555PPPPP5Y5YYYY?????77777!!!!!!!7?J5PY7~!!~^:  \n" +
                                            "    ....:^~^^~7JYY5YYJ?777??77!!!7?JJJ?JJJJYYYYYYYY55555PPPPP5YYYYJJ???????YYYYYYYYJJ??7!!!~^::...  \n" +
                                            "     ...  ...:::^^~~~!!7??JYYYYYYY5PP555P5PPPPPPPGGGGGGGB##BBGPPPPPPPPPPP555YYJ?7!!~~^:::..   ...   \n" +
                                            "        ...        .......:::^~~~!7?JJJYYY55PPPGB#####BB####BP55YYJJ?77!!~~^^::......     ....      \n" +
                                            "              ..... .           .....:::::^^~~~!!!777!!!!!~~^^:::.........     .... .....           \n" +
                                            "                       . .........................................................                  \n" +
                                            "                                     ..   ................  ....                                    \n" +
                                            "                                                                                                    ");
                                    stanleyCup += 1;
                                    points -= 1000000;
                                } else {
                                    System.out.println("YOU CAN'T AFFORD BROKIE");
                                    pointsRequired = 1000000 - points;
                                    System.out.println("You need to get  " + pointsRequired + " more points  to afford");
                                }
                            } else if (choice == 8) { //Beginning of underground casino coin flip scheme

                                System.out.println("****************************************************");
                                System.out.println("IT SEEMS LIKE SOMEONE NEEDS SOME MONEY??");
                                System.out.println("WELL PLACE YOUR BETS AND LETS SEE HOW IT GOES");
                                System.out.println("\nHow much do you want to bet?");
                                System.out.println("In order to leave, enter 0");
                                System.out.println("****************************************************");

                                System.out.println("You currently have " + points);
                                choice = input.nextInt();
                                coinGameBet = choice;

                                if (points <= 0) {
                                    System.out.println("Can't bet if you dont have any points :(");
                                } else if (choice != 0 && choice >= 1) {

                                    System.out.println("Choose 1 for heads, 2 for tails"); //user input
                                    headsOrTails = input.nextInt();
                                    coinFlip = (int) (Math.random() * 2) + 1;

                                    if (headsOrTails == 1) {
                                        System.out.println("You choose heads");
                                    } else if (headsOrTails == 2) {
                                        System.out.println("You choose tails");
                                    }

                                    if (coinFlip == 1) {
                                        System.out.println("\nComputer flipped heads");
                                    } else if (coinFlip == 2) {
                                        System.out.println("\nComputer flipped tails");
                                    }

                                    if (coinFlip == headsOrTails) { //gives user money if they win
                                        int pointsEarned = coinGameBet * 2;
                                        System.out.println("\nCongradulations, you won " + pointsEarned / 2 + " points");
                                        points += pointsEarned / 2;
                                    } else { //takes away money if they lose
                                        System.out.println("\nTough beans, you just lost your bet, but remember 99% of gamblers quit before hitting big");
                                        points -= coinGameBet;
                                    }

                                } else {
                                    System.out.println("See you next time!");
                                }


                            }

                        } while (choice != 7);
                    }


                } while (choice != 4);
                choice =-10; //reset value of choice so the whole program doesn't close and only the game menu is closed

            }
            else if (choice == 2) //INSTRUCTIONS
            {

                    System.out.println("\n\nThe program your in right now was created as an ISU for Mr.Ricci's Computer Science class ");
                    System.out.println("The program first starts when you press start game, where you will move to the main menu ");
                    System.out.println("After that you will be given the chance to learn the basics of computer hardware/cool AI ");
                    System.out.println("With this now newfound information you can now exit the learning menu and go to the quizzes");
                    System.out.println("In the quizzes menu, you are given the option of choosing from different units to do quizzes");
                    System.out.println("Choosing the correct answer will maximize points earned, which can be used to buy items in the store");
                    System.out.println("Have fun and good luck as you learn the depths of computer hardware, and may luck be in your favour :) \n\n");

            }
            else if (choice == 3) //Game Studio
            {
                System.out.println("\n\n****************************************************");
                System.out.println("*             A BILL NGUYEN PRODUCTION             *");
                System.out.println("*                       ©2023                      *");
                System.out.println("****************************************************\n\n");
            }

         else if (choice == 4) {
                System.out.println("Please enter your name");
                Scanner words = new Scanner(System.in);
                String name = words.nextLine();


                System.out.println("Please enter your review");
                String review = words.nextLine();

                System.out.println("\n\n" + review + "\n-" + name);
                System.out.println("Thank you for your review!\n\n");

            }

        } while (choice != 5);

    }
}





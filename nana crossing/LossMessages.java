import java.util.Random;

/**********************************************************************************************************
 * @title LossMessage Class
 * The Game class contains a collection of funny losing messages and a method to print a random one.
 *
 * @authors Chukwunonso Ekweaga, Ashlee Muichirahondo and Alamin Adeleke
 **********************************************************************************************************/
public class LossMessages
{
    // Array of losing messages
        protected static final String[] messages = 
    {
        " got turned into ketchup! Better luck next time!",
        " is gone! Haha, now you have no grandma!",
        ", The old hag didn't make it! Splat!",
        " got yeeted by a semi-truck! Game over!",
        " is now a speed bump. You lose!",
        " got flattened like a pancake! All your VBucks are gone!",
        " got launched into orbit by a speeding car! You lose!",
        " got turned into road pizza! Better call the traffic warden next time!",
        " got vaporized by a rocket car! You lose!",
        " got hit so hard, she time-traveled back to 1923! Game over!",
        " got turned into a hood ornament! You lose!",
        " got hit by a UFO! Aliens took her! No VBucks for you!",
        " got hit by a parade float! Now she's part of the show!",
        " got hit by a food truck! Free tacos, but no VBucks!",
        " got hit by a Tesla on autopilot! Elon sends his condolences!",
        " was turned from 3D to 2D!",
        " Became a fine red mist.",
        " couldn't handle the A-train.",
        " got hit by a drunk driver! Now they're seeing stars... permanently!",
        " got hit by a rogue bulldozer! Construction zone ahead, you lose!",
        " got hit by a runaway ice cream truck! Sweet revenge, but no VBucks for you!",
        " got hit by a rogue forklift! Forked up, you lose!",
        " got pancaked by a monster truck! Hope you like being part of the pavement!",
        " got sent flying by an overenthusiastic grandma in a minivan!",
        " got KO’d by a rogue shopping cart! Supermarket battles are real!",
        " got turned into a cautionary tale! Should’ve watched where they were going!",
        " got caught in a stampede of Black Friday shoppers! Game over!",
        " got deleted from the simulation! Reload your last save!",
        " took a wrong turn and ended up in another dimension. Oops!",
        " got steamrolled—literally! That’s gonna leave a mark!",
        " was last seen flying through the air like a ragdoll! RIP!",
        " took an L so big, it’s now in the history books!",
        " got hit so hard, even Google Maps can’t find them anymore!",
        " just rage-quit real life! Try again!",
        " got clapped by a runaway drone! Skynet is real!",
        " got flattened like a pancake—IHOP would be proud!",
        " got launched like a free trial—expires immediately!",
        " just got ratioed by real life!",
        " got hit by a speedboat… on land. Impressive!",
        " got stomped by an elephant. Game over!",
        " got erased from existence! Thanos would be proud!",
        " got turned into a TikTok challenge… and failed!",
        " got squished like a bug! Better luck next time!",
        " got hit by an invisible truck! Didn’t see that coming?",
        " got dunked on by gravity!",
        " got clapped by a rogue shopping cart! Supermarket survival is no joke!",
        " got hit by a self-driving bike! No one was even on it!",
        " got slapped into the next DLC!",
        " took an L so bad, their controller disconnected!",
        " got hit by a vending machine—should’ve just bought the snack!",
        " got outplayed by an NPC!",
        " got launched like a football! Touchdown for the other team!",
        " got turned into a park bench! Guess they’re part of the scenery now!",
        " got ejected from the server! Connection lost!",
        " got wrecked by a rogue toddler on a tricycle!",
        " got turned into background decoration. Guess they weren’t the main character!",
        " took a shortcut straight to the afterlife!",
        " got hit so hard, even Photoshop can't undo it!",
        " became the new floor texture. Press F to pay respects!",
        " got hit by a scooter going 2mph. Still lost!",
        " tripped over air and lost the game!",
        " lost harder than a Windows update!",
        " got catapulted into the sun! No respawn for you!",
        " got unplugged from reality! Reboot needed!",
        " got wiped off the leaderboard… and the planet!",
        " got steamrolled by life itself!",
        " just became a ghost! Say hi to the others!",
        " got smacked into another timeline!",
        " lost so hard, the game deleted itself!",
        " got tackled by a rogue vacuum cleaner! Sucked into the void!",
        " got obliterated like a Minecraft creeper!",
        " got banished to the Shadow Realm!",
        " got juked by a turtle. Slow and steady wins again!",
        " lost to a goldfish in a staring contest!",
        " just took an L bigger than the Big Bang!",
        " got turned into a loading screen!",
        " got bodied so hard, even history books remember it!",
        " got lost in the backrooms. No way out!",
        " just became DLC… locked behind a paywall!",
        " got clapped by their own bad decisions!",
        " got vaporized by a pixelated explosion!",
        " got thrown into a tornado! Should’ve checked the weather first!",
        " tripped on their own shoelaces—fatal mistake!",
        " got outplayed by a rock! Rock > Paper > You!",
        " got hit by a rogue frisbee—100mph straight to the face!",
        " got blasted into the past! Dinosaur era unlocked!",
        " got dropkicked by fate itself!",
        " got hit by a magic spell… and it wasn’t a healing one!",
        " got trampled by an army of rubber ducks! Not even a joke!",
        " lost so badly, even their WiFi disconnected!",
        " just got used as a human shield—didn’t work!",
        " got hit by a rogue shopping cart at Mach speed!",
        " just found out the hard way that ‘game over’ is real!",
        " got sent to the shadow realm—Yu-Gi-Oh style!",
        " just lost faster than a free trial!",
        " got hit by a watermelon… and it was fatal!",
        " lost so hard, the credits started rolling!",
        " got folded like a lawn chair!",
        " took the biggest L in gaming history!"
    };
    
    /*******************************************************************************************
     * Method to get a random loss message
     * @return a random funny losing message from the MESSAGES array.
     *******************************************************************************************/
    public static String out() 
    {
        Random random = new Random();
        return(App.getName() + messages[random.nextInt(messages.length)]);
    }
}  

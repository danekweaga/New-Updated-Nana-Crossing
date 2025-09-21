# Nana's Crossing 🚗👵

> **📹 [Watch the 5-minute demo video here](https://unbcloud-my.sharepoint.com/personal/n3r9a_unb_ca/_layouts/15/stream.aspx?id=%2Fpersonal%2Fn3r9a_unb_ca%2FDocuments%2FWatch+Out+Nana+Game+Guide.mp4&referrer=StreamWebApp.Web&referrerScenario=AddressBarCopied.view.631ca4bd-de08-4626-8ef9-220e27a7492b&startedResponseCatch=true)**

**Help Nana cross the dangerous highway in this thrilling risk-vs-reward game!**

A strategic probability-based game where players guide a grandmother across an eight-lane highway while making critical decisions about when to cash out their earnings. Perfect for streamers and interactive gameplay!

## 🎮 Game Overview

Watch Out, Nana! combines elements of probability management with strategic decision-making. Each successful lane crossing awards VBucks, but the risk increases with every step. Will you play it safe or go for the maximum payout?

## 👥 Development Team

- **Alamin Adeleke**
- **Chukwunonso Daniel Ekweaga** 
- **Ashlee Rivarashee Muchirahondo**

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- JavaFX libraries
- IDE of your choice (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/danekweaga/New-Updated-Nana-Crossing.git
   cd New-Updated-Nana-Crossing
   ```

2. **Open in your preferred IDE:**
   
   **For IntelliJ IDEA:**
   - Open IntelliJ IDEA
   - Select "Open" and navigate to the project folder
   - Wait for the project to load and index
   - Run the main class (Driver.java)

   **For Eclipse:**
   - Open Eclipse
   - Go to File → Import → Existing Projects into Workspace
   - Select the project folder
   - Click Finish and run the Driver class

   **For VS Code:**
   - Open VS Code
   - Install the Java Extension Pack
   - Open the project folder
   - Use Ctrl+Shift+P → "Java: Run"

   **For Double-J or other IDEs:**
   - Import the project as a Java application
   - Ensure JavaFX is properly configured
   - Set the main class as Driver.java
   - Run the application

3. **Verify Assets:**
   - Ensure all files in `/assets/` folder are present
   - Check that sound files (.mp3) and image files are in correct directories

## 🎯 How to Play

### Starting the Game

1. **Launch the application** - Run the Driver.java file
2. **Home Screen Setup:**
   - **Nana's Name:** Enter a custom name or use the randomly generated one
   - **Settings (Optional):** Click the settings button to customize:
     - **Payout per Lane:** Default 125 VBucks (recommended)
     - **Probability Difference:** Default 3% increase per lane (recommended)
3. **Click "Play"** to begin your crossing adventure!

### Gameplay Mechanics

#### The Challenge
- Navigate Nana across **8 dangerous lanes** of traffic
- Each successful crossing earns you **125 VBucks** (default)
- Risk increases with each lane crossed
- Make strategic decisions: **Cross** or **Cash Out**?

#### Risk System
The probability of failure increases with each lane:
- **Lane 1:** 10% failure rate
- **Lane 2:** 13% failure rate  
- **Lane 3:** 16% failure rate
- **Lane 4:** 19% failure rate
- **Lane 5:** 22% failure rate
- **Lane 6:** 25% failure rate
- **Lane 7:** 28% failure rate
- **Lane 8:** 31% failure rate

**Total success probability for all 8 lanes: ~15.5%**

#### Controls

**🚶‍♀️ Cross Button**
- Attempt to cross the current lane
- Success = Earn VBucks + Move to next lane
- Failure = Lose all VBucks + Game Over

**🚔 Call Traffic Warden Button**  
- Cash out your current earnings safely
- Ends the game with your accumulated VBucks
- Only available during active gameplay

**🔄 Reset Button**
- Return to home screen after game ends
- Available only after winning, losing, or cashing out

### Winning Conditions

- **Full Victory:** Successfully cross all 8 lanes (1,000 VBucks max)
- **Smart Cash-Out:** Stop at any point to keep your earnings
- **Game Over:** Fail a crossing and lose everything

## 🎵 Audio Features

- **Background Music:** Rotating soundtrack on home screen
- **Sound Effects:** Button clicks, victory fanfare, defeat sounds
- **Ambient Audio:** Random car horn sounds during gameplay
- **Customizable:** Replace audio files in `/assets/sounds/` folder

## 🛠️ Customization Guide

### For Streamers & Content Creators

**Personalize Your Experience:**

1. **Custom Names:** Edit `GRANDMA_NAMES` array in `RandomGameText.java`
2. **Custom Loss Messages:** Modify `LOSS_MESSAGES` array for inside jokes
3. **Sound Replacement:** Replace audio files in `/assets/sounds/`
4. **Background Music:** Add .mp3 files to background music folder

### Game Settings
- **Payout Amount:** Adjust risk/reward balance
- **Probability Scaling:** Modify difficulty curve
- **Character Names:** Add community-specific references

## 🎪 Streamer Features

Perfect for interactive streaming:
- **Large, Clear UI** - Easy for viewers to follow
- **Quick Rounds** - Under 5 minutes per game
- **Viewer Participation** - Chat can suggest strategies
- **Tension Building** - Progressive risk creates excitement
- **Immediate Feedback** - Visual and audio responses
- **Customizable Content** - Tailor to your community

## 📁 Project Structure

```
Nana's Crossing/
├── src/
│   ├── Driver.java           # Main application class
│   ├── GameScreen.java       # Core gameplay logic
│   ├── HomeScreen.java       # Main menu and settings
│   ├── MainView.java         # Game visualization
│   ├── RandomGameText.java   # Name and message generation
│   └── [Other game classes]
├── assets/
│   ├── sounds/              # Audio files
│   ├── images/              # Game graphics
│   └── music/               # Background tracks
└── README.md
```

## 🐛 Troubleshooting

**Game Won't Start?**
- Verify all asset files are in correct folders
- Check JavaFX installation and configuration
- Ensure Java version compatibility

**Audio Issues?**
- Confirm .mp3 files are in `/assets/sounds/`
- Check file permissions and paths
- Restart application if audio cuts out

**Performance Problems?**
- Close unnecessary applications
- Update graphics drivers
- Reduce background processes

## 🤝 Contributing

We welcome contributions! Please feel free to:
- Report bugs and issues
- Suggest new features
- Submit pull requests
- Share gameplay feedback

**Ready to help Nana cross the road? Clone the repo and start your crossing adventure today!** 🚗👵✨

*Remember: With great VBucks comes great responsibility...*

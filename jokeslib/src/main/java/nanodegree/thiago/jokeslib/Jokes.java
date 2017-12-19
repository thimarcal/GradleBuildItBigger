package nanodegree.thiago.jokeslib;

public class Jokes {

    private static final String []jokes = {
            "How many tickles does it take to make a squid laugh?\nTen-tickles",
            "Schrödinger’s cat walks into a bar and doesn’t.",
            "What do you get when you put root beer in a square glass?\nA Beer",
            "I bought a universal remote control today. I’m kind of afraid of myself now…\n",
            "Time is money. Therefore, ATMs are time machines.\n"
    };

    public static final String getJoke() {
        int random = (int)(Math.random()*jokes.length);

        return jokes[random];
    }
}

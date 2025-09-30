public class Kalburgi_MadLibs {
    public static void main(String[] args) {
        String context = "It’s late afternoon on set at HollyWood Studios. The crew is quiet and the cameras are rolling, and the corridor of Hogwarts had never looked more real."
        String director = "Director: ACTION!"

        String storyTemplate = "The corridor is quiet except for the flicker of torchlight against the stone walls. You adjust your [object] and glance at Hermione, who’s already scanning the shadows.\n"
                             + "She leans in and says, 'Snape’s nearby. If we don’t reach the [location] soon, we’ll lose our chance.'\n"
                             + "You nod and start moving, the air around you thick and [adjective]. Every step echoes louder than it should.\n"
                             + "Halfway down the hall, a [creature] emerges from behind a tapestry, its eyes locked on you.\n"
                             + "You react instantly, shouting '[exclamation]!' and casting '[spell]'. Your wand glows [color] as the spell hits, sending sparks across the floor.\n"
                             + "The creature stumbles and vanishes into smoke. Hermione lowers her wand, her expression a mix of [emotion] and relief.\n"
                             + "Then, with a soft thud, a [unexpectedObject] drops from the ceiling and rolls to your feet. You both stare at it, unsure whether to laugh or run.\n"
                             + "The director calls 'Cut,' but no one moves. For a moment, it feels like the magic didn’t stop with the scene.";
        String ending = "Director: Cut!"
        System.out.println("Scene Template:");
        System.out.println(storyTemplate);
    }
}

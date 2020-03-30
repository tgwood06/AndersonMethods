public class examples {
    public
    class Pet
            extends Animal {

//...





        public
        String[] getFeedingOptions() {

            return
                    new String[] {
                            "Kibble", "Tuna fish" };

        }

    }





    public
    class Livestock
            extends Animal {

// ...



        public
        String[] getFeedingOptions() {

            return
                    new String[] {
                            "Hay", "Grain",
                            "Smaller Livestock" };

        }

    }
}

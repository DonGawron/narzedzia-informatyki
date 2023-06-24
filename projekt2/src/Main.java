static String calculateBMI(double weight, double height) {

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
        return "Niedowaga";
        }
        else if (bmi < 25) {
        return "Norma";
        }
        else if (bmi < 30) {
        return "Nadwaga";
        }
        else {
        return "Otyłość";
        }
        }
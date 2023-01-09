public class Calculator {   //declare class

        private Floor floor;    //declare private variable
        private Carpet carpet; //declare private variable

        public Calculator(Floor floor, Carpet carpet) {   //instance method with parameter
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {    //get method
            return floor.getArea() * carpet.getCost();
        }
    }

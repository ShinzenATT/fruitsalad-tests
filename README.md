# Running the project
[![wakatime](https://wakatime.com/badge/user/53fb229b-d6c8-4ee4-8592-c1aa087e5019/project/b35736fb-3758-4182-bba3-27a05e7b5a77.svg)](https://wakatime.com/badge/user/53fb229b-d6c8-4ee4-8592-c1aa087e5019/project/b35736fb-3758-4182-bba3-27a05e7b5a77)

For linux/unix systems `./gradlew` is used for most commands while for Windows systems `gradlew.bat` is used.

### Running the project in dev mode

```bash
./gradlew run
```

### Building the project for production

```bash
./gradlew clean build
```

### Packaging the project
The jar will be created in the `build/libs` directory.

```bash
./gradlew clean jar
```

### Generating the project documentation

```bash
./gradlew javadoc
```

# Programming Test Tasks
The task consists of a base scenario with a few extensions
The base scenario and extensions must be solved in order - one at a time
Each part must be reported separately
Total test time 1 h to 1h 15min

## Base Scenario
Pelle and Kajsa drive from Gothenburg to Helsingborg. Along the way
they pass several fruit stands.
Each fruit stand sells baskets of cherries at a price, and baskets with
peaches at a different price.
Pelle wants to buy a basket of cherries, and Kajsa wants to buy a
basket of peaches. They want to stop at only one fruit stand.
What fruit stand should they stop at to minimize the total cost?
The program should print the number of the first fruit stand that has
the lowest possible total price for a basket of cherries and a basket of
peaches (you yourself define the price of the fruits in the stands).

## Extension 1
(Extend the code, based on the code in “Base Scenario”)

There has been a new fruit - pear - among the fruit stands.
Pelle and Kajsa love pears. The fruit basket they are going to buy
must consist of a pear and one (1) other fruit (cherry or peach).
Print the number of the first stand and what the price was.

## Extension 2
(Extend the code, based on the code in Base Scenario + Extension 1)
But what fruits did they buy?
Print out stands, prices and what fruits were purchased.

## Extension 3
(Extend the code, based on the code in Base Scenario + Extension 1
and 2)
Now it turns out that not all fruit stands have all fruits.
Take that into account.
Print out stands, price, what fruits were purchased and by how many
stands the selection was made.

## Extension 4
(Extend the code, based on the code in Base Scenario + Extension 1, 2
and 3)
Now their friend is going the same way. Find out which stand the
friend should buy from.
Note. After Pelle and Kajsa bought their fruit, that fruit is not
available in that stand (the fruit is sold out)
Print out the stand, price and what fruits the friend buys and how
large the selection was.

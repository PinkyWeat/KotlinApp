# calculator

## Description
The main goal of this application is to visualize how much a person may save per month based on how much they earn.

To do that, app calculates the liquid salary of a given person from a database, once that's done, calculates the amount left after taking into account how much would the person save per month.

`More functionalities are yet to be seen.`

------
## Current state

Currently, the app can calculate the liquid salary of a person given all the taxes Uruguay applies per month.

If the person has children or is a professional, those functionalities are not yet implemented.

-----

## File Description

                      **under construction site**

### `com.savingscalc.calculator`

- fakerepository
  - `FakePersonDataStorage`: file mimics an actual database, made in order to create an MVP of the actual final product.
- model
  - `Person`: person template
- service
  - `PersonService`: interface that provides methods to perform operations related to a person's data
  - `PersonServiceImpl`: class is an implementation of the PersonService interface
- util
  - `CalculatorApplication.kt`: functions in order to calculate each of the taxes, then applies them

-----

## Author

Written by [Denisse Landau](https://www.linkedin.com/in/denisselandau/)
# Mortgage Calculator

## Project Objective:
Create a mortgage calculator application that will calculate the total cost and investment growth of different down payment scenarios over a specified time period (e.g., 30 years). Use the provided information to create classes representing down payment scenarios, investments, and mortgage calculations.

## Requirements:
Create a `Mortgage class` with the following attributes:
- Home price
- Down payment percentage
- VA funding fee percentage
- Interest rate
- Property tax
- Home insurance

Create a `MortgageCalculator` class with the following methods:
- `calculateLoanAmount()`: Calculate the loan amount.
- `calculateMonthlyPayment()`: Calculate the monthly payment.
- `calculateTotalPayment()`: Calculate the total payment over the loan period.
- `calculateTotalCost()`: Calculate the total cost, including taxes, insurance, and VA funding fee.

Create an `Investment` class with the following attributes:
- Remaining cash
- Investment return percentage

Create an `InvestmentCalculator` class with the following method:
- `calculateFutureValue()`: Calculate the future value of the investment after a specified number of years.

Create a Main class to run the program with the following steps:
- Instantiate two mortgage scenarios.
- Instantiate an investment for Scenario 1.
- Calculate total costs and investment growth for each scenario using MortgageCalculator and InvestmentCalculator.
- Calculate the difference between total costs and investment growth for each scenario.
- Compare the two scenarios and display the better option.

# Based on the down payment VA Funding fee will decrease
- 0% down payment = 1.75% VA loan fee
- 5% or more and less than 10% down payment = 1.5% VA loan fee
- 10% or more down payment = 1.25% VA loan fee

# Monthly Mortgage formula
<img width="988" alt="image" src="https://user-images.githubusercontent.com/42947580/233633484-9658fbaa-3eac-4f76-8ddf-6adcb4665df4.png">


# Example output
```agsl
Scenario 1: 
Down Payment: 5%
Home Price: $420,000.00
Down Payment: $21,000.00
VA Funding Fee: $5,985.00
Loan Amount: $404,985.00
Interest Rate: 5.75%
Property Tax: $4,000.00
Home Insurance: $1,000.00

Remaining Cash for Investment: $21,000.00
Investment Return: 8%

Total Cost: $948,214.12
Investment Growth: $210,731.51
Difference: $737,482.61

Scenario 2: 
Down Payment: 10%
Home Price: $420,000.00
Down Payment: $42,000.00
VA Funding Fee: $4,725.00
Loan Amount: $382,725.00
Interest Rate: 5.75%
Property Tax: $4,000.00
Home Insurance: $1,200.00

Scenario 1:
Monthly payment: $2,358.93 

Scenario 2:
Do same for scenario 2

Difference:
Total Cost of 30 years of Scenraio 1: $901,944.08
Total Cost of 30 years of Scenraio 2: $801,944.08
Investment Growth: N/A
Difference: $901,944.08

Scenario 1 is the better option.
```

## Scenario 1: 5% Down Payment

| Description           | Amount ($)   |
| --------------------- | ------------ |
| Home Price            | 420,000      |
| Down Payment (5%)     | 21,000       |
| VA Funding Fee (1.5%) | 5,985        |
| Loan Amount           | 404,985      |
| Interest Rate         | 5.75%        |
| Property Tax          | 4,000        |
| Home Insurance        | 1,000        |

**Investment**:

| Description       | Amount ($) |
| ----------------- | ---------- |
| Remaining cash    | 21,000     |
| Investment return | 8%         |

## Scenario 2: 10% Down Payment

| Description           | Amount ($)   |
| --------------------- | ------------ |
| Home Price            | 420,000      |
| Down Payment (10%)    | 42,000       |
| VA Funding Fee (1.25%)| 4,725        |
| Loan Amount           | 382,725      |
| Interest Rate         | 5.75%        |
| Property Tax          | 4,000        |
| Home Insurance        | 1,200        |

Using a mortgage calculator, we find the following payments (principal and interest) for 30 years:

| Scenario | Monthly Payment | Total Payments |
| -------- | --------------- | -------------- |
| 1        | 2,358.93        | 848,214.12     |
| 2        | 2,230.40        | 802,944.08     |

**Total Cost (including taxes, insurance, and VA Funding Fee) after 30 years:**

| Scenario | Total Cost ($)   |
| -------- | ---------------  |
| 1        | 948,214.12       |
| 2        | 901,944.08       |

**Investment Growth after 30 years (assuming 8% return annually):**

| Scenario | Future Value ($) |
| -------- | ---------------- |
| 1        | 210,731.51       |
| 2        | N/A              |

**Difference in Total Cost and Investment Growth:**

| Scenario | Difference ($)  |
| -------- | --------------- |
| 1        | 737,482.61      |
| 2        | 901,944.08      |

In this case, Scenario 1 (5% down payment) seems to be the better option as you will end up paying less over the course of 30 years after considering the investment growth. However, this is based on the assumption that your investment will consistently yield an 8% return each year. It's essential to keep in mind that investments are subject to market risks and returns may vary.

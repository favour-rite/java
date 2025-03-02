
def get_initial_investment():
    principal = float(input("Initial Investment: "))
    return principal

def get_monthly_contribution():
    monthly_contribution = float(input("Enter monthly contribution: "))
    return monthly_contribution

def get_number_of_years():
    years = int(input("Enter number of years: "))
    return years

def get_annual_rate():
    annual_rate = float(input("Enter interest rate in percentage (e.g., 5%): "))
    return annual_rate

def get_interest_rate_variance():
   
    range_variance = float(input("Enter interest rate variance range: "))
    return range_variance

def get_compound_frequency():
    compound_frequency = int(input("For compound frequency, 1 for daily or 2 for monthly: "))
    return compound_frequency

def get_frequency(compound_frequency):
    if compound_frequency == 1:
        return 365
    elif compound_frequency == 2:
        return 12
    else:
        print("Invalid input for compound frequency. Defaulting to monthly (12).")
        return 12

def calculate_compound_interest(principal, converted_annual_rate, monthly_contribution, compound_frequency, years, frequency):
   
    future_value_of_initial_investment = principal * (1 + (converted_annual_rate / frequency)) ** (frequency * years)

    
    step1 = (1 + (converted_annual_rate / frequency)) ** (frequency * years) - 1
    step2 = (converted_annual_rate / frequency)
    future_value_of_monthly_contributions = monthly_contribution * (step1 / step2)

    
    return future_value_of_initial_investment + future_value_of_monthly_contributions

def main():
    principal = get_initial_investment()
    monthly_contribution = get_monthly_contribution()
    years = get_number_of_years()
    annual_rate = get_annual_rate()
    converted_annual_rate = annual_rate / 100
    range_variance = get_interest_rate_variance() 
    compound_frequency = get_compound_frequency()
    frequency = get_frequency(compound_frequency)

    future_value = calculate_compound_interest(principal, converted_annual_rate, monthly_contribution, compound_frequency, years, frequency)
    print(f"The compound interest value is {future_value:,.2f}")

if __name__ == "__main__":
    main()
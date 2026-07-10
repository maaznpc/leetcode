import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    salary = employee['salary'].drop_duplicates().sort_values(ascending=False).reset_index(drop=True)
    if len(salary)>=2:
        return pd.DataFrame({'SecondHighestSalary': [salary.iloc[1]]})
    else:
        return pd.DataFrame({'SecondHighestSalary': [None]})

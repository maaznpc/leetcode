import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    salaries = employee['salary'].drop_duplicates().sort_values(ascending=False).reset_index(drop=True)
    if len(salaries) >= N and N>0:
        return pd.DataFrame({f'getNthHighestSalary({N})': [salaries.iloc[N-1]]})
    else:
        return pd.DataFrame({f'getNthHighestSalary({N})': [None]})

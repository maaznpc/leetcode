import pandas as pd

def department_highest_salary(employee: pd.DataFrame, department: pd.DataFrame) -> pd.DataFrame:
    s= employee.merge(
        department,
        left_on="departmentId",
        right_on='id'
        )
    max_salary=s.groupby('departmentId')['salary'].transform('max')
    return s[s['salary'] == max_salary][['name_y', 'name_x' ,'salary']].rename(
         columns ={
            'name_y': 'department',
            'name_x': 'employee' ,
            'salary': 'salary'}
    )

import {Component, OnInit} from '@angular/core';
import {Employee} from "../employee";
import {EmployeesService} from "../employees.service";

@Component({
    selector: 'app-employees-list',
    templateUrl: './employees-list.component.html',
    styleUrls: ['./employees-list.component.css']
})
export class EmployeesListComponent implements OnInit {

    employees:Employee[] = [];

    constructor(private employeeService: EmployeesService) {
    }

    ngOnInit() {
        this.employeeService.getEmployees().subscribe(employeeList => {
            this.employees = employeeList;
            console.log(this.employees);
        })

    }

}

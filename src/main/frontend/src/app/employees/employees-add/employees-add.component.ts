import { Component, OnInit } from '@angular/core';
import {EmployeesService} from "../employees.service";
import {EmployeesListComponent} from "../employees-list/employees-list.component";

@Component({
  selector: 'app-employees-add',
  templateUrl: './employees-add.component.html',
  styleUrls: ['./employees-add.component.css']
})
export class EmployeesAddComponent implements OnInit {

  constructor(private employeeService:EmployeesService) { }

  ngOnInit() {
  }



    onClickSubmit(data){
      console.log(data.fname);
      this.employeeService.save(data).subscribe();
      location.reload();
    }
}

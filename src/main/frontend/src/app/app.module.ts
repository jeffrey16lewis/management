import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './employees/employees.component';
import { EmployeesAddComponent } from './employees/employees-add/employees-add.component';
import { EmployeesListComponent } from './employees/employees-list/employees-list.component';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {EmployeesService} from "./employees/employees.service";
import {MessageService} from "./message.service";
import {FormsModule} from "@angular/forms";
import {DATE} from "ngx-bootstrap/chronos/units/constants";
import {DatepickerModule} from "ngx-bootstrap";

@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    EmployeesAddComponent,
    EmployeesListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
      HttpClientModule,
      FormsModule,
      DatepickerModule

  ],
  providers: [EmployeesService, MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }

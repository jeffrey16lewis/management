import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './employees/employees.component';
import { EmployeesAddComponent } from './employees/employees-add/employees-add.component';
import { EmployeesListComponent } from './employees/employees-list/employees-list.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    EmployeesAddComponent,
    EmployeesListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable, of} from "rxjs/index";
import {Employee} from "./employee";

import {catchError} from "rxjs/internal/operators";
import {MessageService} from "../message.service";

let url = "http://localhost:8080";
@Injectable()
export class EmployeesService {


     httpOptions = {
        headers: new HttpHeaders({
            'Content-Type':  'application/json',
            'Access-Control-Allow-Origin': "*",
            'Access-Control-Allow-Methods': 'GET,PUT,POST,DELETE'

        })
    };

  constructor(private http: HttpClient,
              private messageService: MessageService) { }

  getEmployees(): Observable<Employee[]>{
      return this.http.get<any[]>("/api/employee")
          .pipe(
              catchError(this.handleError("not captured",[]))
          )
  }
  save(employee:Employee): Observable<Employee> {
      console.log(employee.phoneNumber);
      return this.http.post<any>(url+ "/api/employee/save", employee, this.httpOptions)
          .pipe(
              catchError(this.handleError("save employee", employee))
          );
  }
    private handleError<T> (operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {

            // TODO: send the error to remote logging infrastructure
            console.log(error); // log to console instead

            // TODO: better job of transforming error for user consumption
            this.log(`${operation} failed: ${error.message}`);

            // Let the app keep running by returning an empty result.
            return of(result as T);
        };
    }

    private log(message: string) {
        this.messageService.add(`HeroService: ${message}`);
    }

}

import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable, of} from "rxjs/index";
import {Employee} from "./employee";

import {catchError} from "rxjs/internal/operators";
import {MessageService} from "../message.service";


@Injectable()
export class EmployeesService {

  constructor(private http: HttpClient,
              private messageService: MessageService) { }

  getEmployees(): Observable<Employee[]>{
      return this.http.get<any[]>("/api/employee/")
          .pipe(
              catchError(this.handleError("not captured",[]))
          )
  }
    private handleError<T> (operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {

            // TODO: send the error to remote logging infrastructure
            console.error(error); // log to console instead

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

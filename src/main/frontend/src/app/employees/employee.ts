import {DatePipe} from "@angular/common";

export class Employee {

    city: string;
    dob: string;
    emailAddress: string;
    empId: any;
    fname: string;
    lname: string;
    phoneNumber: string;
    state:string;
    streetAddress: string;
    zipCode: string;




    constructor(empId: any, fname: string, lname: string, streetAddress: string,
                city: string, state: string, zipCode: string, emailAddress: string, phoneNumber: string, dob:string){
        this.empId = empId;
        this.fname = fname;
        this.lname = lname;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }


}

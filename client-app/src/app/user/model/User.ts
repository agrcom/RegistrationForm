import { Contact } from "./User.contact";

export class User {

id: number;
firstName: string;
lastName: string;
email: string;
contact: Contact;

constructor(id: number, firstName: string, lastName: string, email: string, contact: Contact){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.contact = contact;
  }

}

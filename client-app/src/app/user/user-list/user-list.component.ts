import { Component, OnInit } from '@angular/core';
import { User } from "../model/User";
import { UserService } from "../user.service";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css'],
  providers: [UserService]
})
export class UserListComponent implements OnInit {

  private users: User[];

  constructor(private userService: UserService) { }

  ngOnInit() { //when component loading get all users and set the users[]
    this.getAllUsers();
  }

  getAllUsers() {
    this.userService.findAll().subscribe(
      users => {
        this.users = users;
      },
      err => {
        console.log(err);
      }

    );
  }

}

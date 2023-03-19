import {Component, OnInit} from '@angular/core';

import {HttpClient, HttpResponse, HttpErrorResponse} from '@angular/common/http';
import Swal from "sweetalert2";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  private url = 'http://localhost:8080/api/currency?date=2021-03-02';
  gets: any;
  userInput ?: string = "2023-03-02";

  constructor(private httpClient: HttpClient) {
  }

  ngOnInit() {
    this.getPostsFromComponent();
  }


  getPostsFromComponent() {
    this.url = 'http://localhost:8080/api/currency?date=' + this.userInput;
    console.log(this.url)
    return this.httpClient.get(this.url).subscribe(response => {
      this.gets = response;
    }, (error: HttpErrorResponse) => {
      if (error.status !== 200) {
        this.tinyAlert()
      }
    });
  }

  tinyAlert() {
    Swal.fire('SELECTED DATE HAS NO  CURRENCY VALUE !');
  }


}

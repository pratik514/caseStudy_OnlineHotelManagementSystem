import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Guest } from './guest/guest';

@Injectable({
  providedIn: 'root'
})
export class SignUpService {
  private baseURL = "http://localhost:9999/Receptionist/Guest";

  constructor(private httpClient: HttpClient) { }

  getGuestList():Observable<any>{
    console.log("hii");
    return this.httpClient.get<any>(this.baseURL + '/getAllGuest')

  }

  addGuestList(guest:Guest){
    console.log(guest);
    return this.httpClient.post<any>(this.baseURL+'/addGuest',guest);
    
  }
}

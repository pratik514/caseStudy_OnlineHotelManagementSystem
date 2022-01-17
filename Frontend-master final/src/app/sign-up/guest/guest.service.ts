import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Guest } from './guest';

@Injectable({
  providedIn: 'root'
})
export class GuestService {
  private baseURL = "http://localhost:8083/Receptionist/Guest";

  constructor(private httpClient: HttpClient) { }

  getGuestList():Observable<any>{
    console.log("HI");
    return this.httpClient.get<any>(this.baseURL + '/getAllGuest')

  }

  addGuestList(guest:Guest){
    console.log(guest);
    return this.httpClient.post<any>(this.baseURL+'/addGuest',guest);
    
  }

  
}

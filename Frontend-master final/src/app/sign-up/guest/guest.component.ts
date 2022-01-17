import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Guest } from './guest';
import { GuestService } from './guest.service';

@Component({
  selector: 'app-guest',
  templateUrl: './guest.component.html',
  styleUrls: ['./guest.component.css']
})
export class GuestComponent implements OnInit {

  res:Guest=new Guest;
  guest:any;
  formValue: any;


  constructor(private guestService:GuestService,private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.formValue = this.formBuilder.group({
      gid: [''],
      gname: [''],
      gcontact: [''],
      gemail: [''],
      ggender: [''],
      gaddress: ['']
    })
    this.addGuest();
    this.getGuest();
  }

  getGuest(){
    this.guestService.getGuestList().subscribe(data =>{
      console.log(Object.values(data.allGuest));
      this.guest=data.allGuest;
    })
  }

  addGuest(){
    this.guestService.addGuestList(this.guest).subscribe(data =>{
      console.log(Object.values(data.allGuest));
      this.guest=data.allGuest;
    })
  }


}

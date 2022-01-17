import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Guest } from './guest/guest';
import { GuestService } from './guest/guest.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  res:Guest=new Guest;
  guest:any;
  formValue: any;

  constructor(private formBuilder: FormBuilder,private api: GuestService , private guestService:GuestService) { }

  ngOnInit(): void {
    this.formValue = this.formBuilder.group({
      gid: [''],
      gname: [''],
      gcontact: [''],
      gemail: [''],
      ggender: [''],
      address: ['']
    })
  }

  addGuest() {
    this.res.guestId = this.formValue.value.gid;
    this.res.guestName = this.formValue.value.gname;
    this.res.guestContact = this.formValue.value.gcontact;
    this.res.guestEmail = this.formValue.value.gemail;
    this.res.guestGender = this.formValue.value.ggender;
    this.res.guestAddress = this.formValue.value.address;

    this.api.addGuestList(this.res).subscribe(data => {
      console.log(data.allGuest);
      alert('Guest Added!!!');
      let ref = document.getElementById('clear');
      ref?.click();

      this.formValue.reset;
      
      

    },
      err => {
        alert('Guest Added!!!');
      }
    )

  }
}

import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { MetaModule } from '../../services/meta.module';

@Component({
  selector: 'app-sellerlist',
  standalone: true,
  imports: [MetaModule],
  templateUrl: './sellerlist.component.html',
  styleUrl: './sellerlist.component.css'
})
export class SellerlistComponent {

  displayedColumns: string[] = ['Vorname', 'Nachname', 'Straße', 'Nummer']

  constructor(private router: Router) {}

  navigateTo(path: string){
    this.router.navigate([path])
  };

}

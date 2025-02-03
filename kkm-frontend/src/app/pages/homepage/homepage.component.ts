import { Component } from '@angular/core';
import { MetaModule } from '../../services/meta.module';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  standalone: true,
  imports: [MetaModule],
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent {

  constructor(private router: Router) {}

  navigateTo(path: string){
    this.router.navigate([path])
  };

}

import { Component } from '@angular/core';
import { MetaModule } from '../../services/meta.module';

@Component({
  selector: 'app-homepage',
  standalone: true,
  imports: [MetaModule],
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent {

}

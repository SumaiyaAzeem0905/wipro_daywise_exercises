import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';

import { SecondcompComponent } from './app/secondcomp/secondcomp.component';
import { LoginComponent } from './app/login/login.component';
import { ThirdcomponenetComponent } from './app/thirdcomponenet/thirdcomponenet.component';

bootstrapApplication(ThirdcomponenetComponent, appConfig)
  .catch((err) => console.error(err));

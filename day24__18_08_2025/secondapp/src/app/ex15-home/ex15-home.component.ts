import { Component } from '@angular/core';

@Component({
  selector: 'app-ex15-home',
  imports: [],
  templateUrl: './ex15-home.component.html',
  styleUrl: './ex15-home.component.css'
})
export class Ex15HomeComponent {
books = [
    { title: 'The Great Gatsby', image: 'https://covers.openlibrary.org/b/id/7222246-L.jpg', description: 'Classic American novel' },
    { title: 'To Kill a Mockingbird', image: 'https://covers.openlibrary.org/b/id/8228691-L.jpg', description: 'Justice and innocence' },
    { title: '1984', image: 'https://covers.openlibrary.org/b/id/7222246-L.jpg', description: 'Dystopian future story' },
    { title: 'Moby Dick', image: 'https://covers.openlibrary.org/b/id/555102-L.jpg', description: 'Man vs giant whale' },
    { title: 'Pride and Prejudice', image: 'https://covers.openlibrary.org/b/id/8231856-L.jpg', description: 'Romance and society' },

    { title: 'The Hobbit', image: 'https://covers.openlibrary.org/b/id/6979861-L.jpg', description: 'Adventure of Bilbo' },
    { title: 'Harry Potter', image: 'https://covers.openlibrary.org/b/id/7984916-L.jpg', description: 'Wizarding school magic' },
    { title: 'The Alchemist', image: 'https://covers.openlibrary.org/b/id/8101342-L.jpg', description: 'Dreams and destiny' },
    { title: 'The Catcher in the Rye', image: 'https://covers.openlibrary.org/b/id/8235116-L.jpg', description: 'Teenage rebellion' },
    { title: 'War and Peace', image: 'https://covers.openlibrary.org/b/id/7222161-L.jpg', description: 'Epic Russian tale' },

    { title: 'The Odyssey', image: 'https://covers.openlibrary.org/b/id/8231852-L.jpg', description: 'Greek hero journey' },
    { title: 'Hamlet', image: 'https://covers.openlibrary.org/b/id/8231992-L.jpg', description: 'Shakespearean tragedy' },
    { title: 'Don Quixote', image: 'https://covers.openlibrary.org/b/id/8235081-L.jpg', description: 'Knightly adventures' },
    { title: 'Jane Eyre', image: 'https://covers.openlibrary.org/b/id/8228690-L.jpg', description: 'Love and independence' },
    { title: 'The Divine Comedy', image: 'https://covers.openlibrary.org/b/id/8231838-L.jpg', description: 'Journey through afterlife' },

    { title: 'Frankenstein', image: 'https://covers.openlibrary.org/b/id/7222241-L.jpg', description: 'Monster and creator' },
    { title: 'Brave New World', image: 'https://covers.openlibrary.org/b/id/8228694-L.jpg', description: 'Futuristic dystopia' },
    { title: 'Crime and Punishment', image: 'https://covers.openlibrary.org/b/id/8228696-L.jpg', description: 'Murder and guilt' },
    { title: 'The Iliad', image: 'https://covers.openlibrary.org/b/id/8231827-L.jpg', description: 'Trojan war epic' },
    { title: 'Les Misérables', image: 'https://covers.openlibrary.org/b/id/7222270-L.jpg', description: 'Justice and redemption' }
  ];
}

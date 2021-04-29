package com.example.architecturecomponent.ui.utils

import com.example.architecturecomponent.R
import com.example.architecturecomponent.data.MovieEntity
import com.example.architecturecomponent.data.TvShowEntity

object DataDummy {

    fun generateDummyMovie(): List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                "M1",
                R.drawable.poster_spiderman,
                "Spider-Man: Into the Spider-Verse (2018)",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                8.4,
                "12/14/2018 (US)",
                "1h 57m",
                "Action, Adventure, Animation, Science Fiction, Comedy"
            )
        )

        movies.add(
            MovieEntity(
                "M2",
                R.drawable.poster_ralph,
                "Ralph Breaks the Internet (2018)",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                7.3,
                "11/21/2018 (US)",
                "1h 52m",
                "Family, Animation, Comedy, Adventure"
            )
        )

        movies.add(
            MovieEntity(
                "M3",
                R.drawable.poster_aquaman,
                "Aquaman (2018)",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                7.2,
                "12/21/2018 (US)",
                "2h 23m",
                "Action, Adventure, Fantasy"
            )
        )

        movies.add(
            MovieEntity(
                "M4",
                R.drawable.poster_how_to_train,
                "How to Train Your Dragon: The Hidden World (2019)",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                7.9,
                "02/22/2019 (US)",
                "1h 44m",
                "Animation, Family, Adventure"
            )
        )

        movies.add(
            MovieEntity(
                "M5",
                R.drawable.poster_alita,
                "Alita: Battle Angel (2019)",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                7.7,
                "02/14/2019 (US)",
                "2h 2m",
                "Action, Science Fiction, Adventure"
            )
        )

        movies.add(
            MovieEntity(
                "M6",
                R.drawable.poster_bohemian,
                "Bohemian Rhapsody (2018)",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                8.2,
                "11/02/2018 (US)",
                "2h 15m",
                "Music, Drama, History"
            )
        )

        movies.add(
            MovieEntity(
                "M7",
                R.drawable.poster_cold_persuit,
                "Cold Pursuit (2019)",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                6.3,
                "02/08/2019 (US)",
                "1h 59m",
                "Action, Crime, Thriller"
            )
        )

        movies.add(
            MovieEntity(
                "M8",
                R.drawable.poster_creed,
                "Creed II (2018)",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                7.4,
                "11/21/2018 (US)",
                "2h 10m",
                "Drama"
            )
        )

        movies.add(
            MovieEntity(
                "M9",
                R.drawable.poster_glass,
                "Glass (2019)",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                6.8,
                "01/18/2019 (US)",
                "2h 9m",
                "Thriller, Drama, Science Fiction"
            )
        )

        movies.add(
            MovieEntity(
                "M10",
                R.drawable.poster_infinity_war,
                "Avengers: Infinity War (2018)",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                8.4,
                "01/18/2019 (US)",
                "2h 29m",
                "Thriller, Drama, Science Fiction"
            )
        )

        return movies
    }

    fun generateDummyTvShow(): List<TvShowEntity> {
        val tvShows = ArrayList<TvShowEntity>()

        tvShows.add(
            TvShowEntity(
                "T1",
                R.drawable.poster_naruto_shipudden,
                "Naruto Shippūden (2007)",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                8.3,
                "2007",
                "25m",
                "Animation, Action & Adventure, Sci-Fi & Fantasy"
            )
        )

        tvShows.add(
            TvShowEntity(
                "T2",
                R.drawable.poster_family_guy,
                "Family Guy (1999)",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                8.2,
                "1999",
                "22m",
                "Animation, Comedy"
            )
        )

        tvShows.add(
            TvShowEntity(
                "T3",
                R.drawable.poster_the_simpson,
                "The Simpsons (1989)",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                8.4,
                "1989",
                "22m",
                "Family, Animation, Comedy"
            )
        )

        tvShows.add(
            TvShowEntity(
                "T4",
                R.drawable.poster_arrow,
                "Arrow (2012)",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                8.2,
                "2012",
                "42m",
                "Crime, Drama, Mystery, Action & Adventure"
            )
        )

        tvShows.add(
            TvShowEntity(
                "T5",
                R.drawable.poster_doom_patrol,
                "Doom Patrol (2019)",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                8.0,
                "2019",
                "49m",
                "Sci-Fi & Fantasy, Comedy, Drama"
            )
        )

        tvShows.add(
            TvShowEntity(
                "T6",
                R.drawable.poster_fairytail,
                "Fairy Tail (2009)",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                8.5,
                "2009",
                "25m",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy"
            )
        )

        tvShows.add(
            TvShowEntity(
                "T7",
                R.drawable.poster_flash,
                "The Flash (2014)",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                8.4,
                "2014",
                "44m",
                "Drama, Sci-Fi & Fantasy"
            )
        )

        tvShows.add(
            TvShowEntity(
                "T8",
                R.drawable.poster_gotham,
                "Gotham (2014)",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                8.2,
                "2014",
                "43m",
                "Drama, Crime, Sci-Fi & Fantasy"
            )
        )

        tvShows.add(
            TvShowEntity(
                "T9",
                R.drawable.poster_grey_anatomy,
                "Grey's Anatomy (2005)",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                8.5,
                "2005",
                "43m",
                "Drama"
            )
        )

        tvShows.add(
            TvShowEntity(
                "T10",
                R.drawable.poster_hanna,
                "Hanna (2019)",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                8.0,
                "2019",
                "50m",
                "Action & Adventure, Drama"
            )
        )

        return tvShows
    }

}
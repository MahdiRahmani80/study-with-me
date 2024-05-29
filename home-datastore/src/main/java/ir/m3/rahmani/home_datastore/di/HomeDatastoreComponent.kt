package ir.m3.rahmani.home_datastore.di

import dagger.Subcomponent

@Subcomponent
interface HomeDatastoreComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): HomeDatastoreComponent
    }

    // TODO : add home data store with provide and singleton
}